package com.rantas.training;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.rantas.training.model.AboutFood;

import java.util.LinkedList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

public static final String LOG_ADAPTER = MyAdapter.class.getSimpleName();

private LinkedList<AboutFood> myList;
private LayoutInflater layoutInflater;
private Context context;

class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public final String LOG_HOLDER = MyViewHolder.class.getSimpleName();
    public static final String RECEIP = "receip";

    public TextView head;
    public TextView description;
    public ConstraintLayout layoutFather;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        Log.i(LOG_HOLDER,"view pointing");
        head = itemView.findViewById(R.id.descriptionHead);
        description = itemView.findViewById(R.id.description);
        layoutFather = itemView.findViewById(R.id.myLayout);

        layoutFather.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.i(LOG_HOLDER,"click on button");
        Intent mIntent = new Intent(context,MainActivity2nd.class);
        mIntent.putExtra(RECEIP,myList.get(getLayoutPosition()));
        context.startActivity(mIntent);

    }
}

    public MyAdapter(Context context, LinkedList<AboutFood> myList){
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.myList =myList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.i(LOG_ADAPTER,"inflate layout");
        View rItemView = layoutInflater.inflate(R.layout.data_training,parent,false);
        return new MyViewHolder(rItemView);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Log.i(LOG_ADAPTER,"binding layout");
        AboutFood aboutFood = myList.get(position);

        String food = aboutFood.getFood();
        String description =aboutFood.getDescription();

        holder.head.setText(food);
        holder.description.setText(description);
    }

    @Override
    public int getItemCount() {
    Log.i(LOG_ADAPTER,"counting");
    return myList.size();
    }

}






