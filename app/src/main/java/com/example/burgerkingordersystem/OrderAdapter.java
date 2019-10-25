package com.example.burgerkingordersystem;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.OrderViewHolder>{
    private ArrayList<Order> orderToAdapt;

    public void setData(ArrayList<Order> orderToAdapt) {
        this.orderToAdapt = orderToAdapt;
    }
    @NonNull
    @Override
    public OrderViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext())
                .inflate(R.layout.order, parent,false);

        OrderViewHolder orderViewHolder = new OrderViewHolder(view);
        return orderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OrderViewHolder holder, int position){
        final Order orderAtPosition = orderToAdapt.get(position);


       //add holder
    }

    public int getItemCount(){
        return orderToAdapt.size();
    }

    public static class OrderViewHolder extends RecyclerView.ViewHolder{


        public View view;
        public ImageView mPhoto;
        public TextView mName;
        public TextView mCost;


        public OrderViewHolder(View v){
            super(v);
            view = v;
            mPhoto = v.findViewById(R.id.itemPhoto);
            mName = v.findViewById(R.id.itemName);
            mCost = v.findViewById(R.id.itemPrice);

        }
    }
}
