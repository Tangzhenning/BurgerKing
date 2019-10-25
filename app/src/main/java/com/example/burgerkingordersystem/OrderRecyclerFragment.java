package com.example.burgerkingordersystem;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class OrderRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

//    public MenuRecyclerFragment(){
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragement_order_recycler, container,false);

        recyclerView = view.findViewById(R.id.rv_main2);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter orderAdapter = new OrderAdapter();

        orderAdapter.setData(OrderDatabase.getAllOrder());
        recyclerView.setAdapter(orderAdapter);

        return view;
    }

    @Override
    public void onResume(){
        super.onResume();
    }

}
