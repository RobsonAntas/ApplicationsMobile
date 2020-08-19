package com.rantas.tinddevs;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rantas.tinddevs.model.Dev;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewAdapter.NewMyHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private List<Dev> devList;

    public void setDevList(List<Dev> devList) {
        this.devList = devList;
    }

    public NewAdapter(Context context,List<Dev> devList) {
        this.context = context;
        this.layoutInflater = LayoutInflater.from(this.context);;
        this.devList = devList;
    }

    public  class NewMyHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public LinearLayout linearLayout;
        TextView textView;
        ImageView imageView;

        public NewMyHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textFromChild);
            imageView = itemView.findViewById(R.id.imageFromChild);

            linearLayout = itemView.findViewById(R.id.layoutParent);
            linearLayout.setOnClickListener(this);
        }



        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context,SubMainActivity.class);
            intent.putExtra("profile",devList.get(getLayoutPosition()));
            context.startActivity(intent);


        }
    }

    @NonNull
    @Override
    public NewMyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = this.layoutInflater.inflate(R.layout.linear_layout,parent,false);
        return new NewMyHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull NewMyHolder holder, int position) {
        Dev dev = this.devList.get(position);
        String url = dev.getThumbnailUrl();
        Picasso.get().load(url).into(holder.imageView);
        holder.textView.setText(dev.getThumbnailUrl());

    }

    @Override
    public int getItemCount() {
        return this.devList.size();
    }
}

