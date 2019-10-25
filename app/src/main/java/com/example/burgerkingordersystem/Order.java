package com.example.burgerkingordersystem;

public class Order {

    // unique identifier of an article
    private int ID;
    private String Foodname;
    private int Cost;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imgaeDrawableID;
    private int quantity;


    public Order(int ID, String Foodname, int Cost, int imgaeDrawableID, int quantity) {
        this.ID = ID;
        this.Foodname = Foodname;
        this.Cost = Cost;
        this.imgaeDrawableID = imgaeDrawableID;
        this.quantity = quantity;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFoodname() {
        return Foodname;
    }

    public void setFoodname(String foodname) {
        Foodname = foodname;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(int cost) {
        Cost = cost;
    }

    public int getImgaeDrawableID() {
        return imgaeDrawableID;
    }

    public void setImgaeDrawableID(int imgaeDrawableID) {
        this.imgaeDrawableID = imgaeDrawableID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
