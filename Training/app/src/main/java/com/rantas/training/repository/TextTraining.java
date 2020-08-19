package com.rantas.training.repository;

import android.util.Log;

import com.rantas.training.model.AboutFood;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TextTraining {
    public static final String LOG_REP = TextTraining.class.getSimpleName();
    public LinkedList<AboutFood> writing;

    public TextTraining() {
        Log.i(LOG_REP,"creating a list");
        this.writing = new LinkedList<>();

        this.writing.add(new AboutFood("Pastel de forno", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec vitae porttitor nunc. Vivamus aliquam sapien vel risus pellentesque, sed pellentesque purus pretium. In dignissim auctor eros, a malesuada ex ornare eu. Vivamus a sapien sit amet ex fermentum faucibus id nec eros. Praesent tincidunt ut mauris nec volutpat. Donec cursus eget nibh non mollis. Sed rutrum erat at luctus finibus. Phasellus eleifend libero magna, a tristique dui congue id. Ut accumsan turpis in dolor mollis feugiat."));
        this.writing.add(new AboutFood("Sarapatel de Javali", "Duis ultrices accumsan mollis. Nulla urna orci, interdum nec rutrum ut, aliquet id magna. Integer leo enim, commodo sit amet nibh vitae, luctus dictum purus. Aliquam bibendum augue non enim sagittis ultricies. Nunc sed consequat urna. Ut efficitur, tellus non pretium lobortis, ipsum purus congue nulla, in tristique lacus risus eget neque. Nulla venenatis augue finibus imperdiet rutrum. Praesent ornare faucibus massa, quis tincidunt tortor imperdiet id."));
        this.writing.add(new AboutFood("Guisado de jacaré", "Phasellus sapien erat, feugiat eget elementum id, ullamcorper in tortor. In hac habitasse platea dictumst. Etiam rhoncus vulputate ligula quis finibus. Duis quis lacus at tortor condimentum tempus. Nulla facilisi. Aliquam consequat, felis sed imperdiet pulvinar, tortor nunc feugiat purus, nec sodales tortor lacus nec metus. Aenean interdum, ante eu consequat porttitor, ligula nisi auctor turpis, et gravida ligula nibh a felis."));
        this.writing.add(new AboutFood("Fígado de Buffalo", "In eget semper metus. Maecenas ultrices a urna vel faucibus. Maecenas vel ultrices metus. Cras eget nulla lectus. Nam quis rutrum justo, vitae feugiat est. Donec efficitur et velit ut varius. Aenean euismod maximus elementum. Sed sed orci porttitor, rhoncus risus sit amet, elementum neque."));
        this.writing.add(new AboutFood("Pudim de Amedoim", "Ut massa dui, consequat a neque ut, tempor varius dolor. Aliquam faucibus malesuada egestas. Phasellus ac consequat purus, vel accumsan purus. Integer at nulla ac nulla finibus ultrices vitae id mauris. In hac habitasse platea dictumst. Proin viverra metus at tortor egestas placerat. Nullam tellus enim, consequat nec sem in, pharetra ornare elit. Nunc lobortis urna at nulla pulvinar, vitae maximus metus condimentum"));


    }

    public LinkedList<AboutFood> getWriting() {
        return writing;
    }
}
