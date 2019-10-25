package com.example.burgerkingordersystem;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MenuDetailActivity extends AppCompatActivity {
    private ImageView itemPhoto;
    private TextView orderQuantity;
    private TextView detialName;
    private TextView detialCost;
    private TextView description;
    private ImageButton plus;
    private ImageButton minus;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detial);

        Intent intent = getIntent();

        int ID =intent.getIntExtra("Item ID", 0);

        Food food = FoodDatabase.getFoodById(ID);

        itemPhoto = findViewById(R.id.imageView2);

        orderQuantity = findViewById(R.id.itemQuantity);//create an attribute to store the quantity

        detialName = findViewById(R.id.detialName);
        detialCost = findViewById(R.id.detialPrice);
        description =findViewById(R.id.detialDescription);
        plus=findViewById(R.id.plusButton);
        minus=findViewById(R.id.minusButton);

        itemPhoto.setImageResource(food.getImgaeDrawableID());
        //orderQuantity.setText();
        detialName.setText(food.getFoodname());
        detialCost.setText((int) food.getCost());
        description.setText(food.getDeccription());

        plus.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

            }
        });




    }

}
