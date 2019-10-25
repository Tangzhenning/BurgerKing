package com.example.burgerkingordersystem;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{

    private ArrayList<Food> foodToAdapt;

    public void setData(ArrayList<Food> foodToAdapt){
        this.foodToAdapt=foodToAdapt;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view =LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu, parent,false);

        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder (@NonNull MenuViewHolder holder, final int position) {
        final Food foodAtPosition = foodToAdapt.get(position);

        holder.mPhoto.setImageResource(foodAtPosition.getImgaeDrawableID());
        holder.mName.setText(foodAtPosition.getFoodname());
        holder.mCost.setText(Integer.toString((int) foodAtPosition.getCost()));

        holder.view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }

    @Override
    public int getItemCount() {
        return foodToAdapt.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder{
        public View view;
        public ImageView mPhoto;
        public TextView mName;
        public TextView mCost;


        public MenuViewHolder(View v){
            super(v);
            view = v;
            mPhoto = v.findViewById(R.id.itemPhoto);
            mName = v.findViewById(R.id.itemName);
            mCost = v.findViewById(R.id.itemPrice);

        }
    }
}