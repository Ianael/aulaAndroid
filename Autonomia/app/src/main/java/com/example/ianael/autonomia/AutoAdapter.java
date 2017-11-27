package com.example.ianael.autonomia;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by ianael on 26/11/2017.
 */

public class AutoAdapter extends RecyclerView.Adapter{

    private ArrayList<Autonomia> info;

    public void setInfo(ArrayList<Autonomia> info){
        this.info = info;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_lista ,parent, false);
        AutoHolder gaveta = new AutoHolder(layoutView);
        return gaveta;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        AutoHolder gaveta = (AutoHolder) holder;
        Autonomia atual = this.info.get(position);
        gaveta.atualiza( atual );
    }

    @Override
    public int getItemCount(){
        return this.info.size();
    }
}
