package com.example.burgerkingordersystem;

public class Food {

    // unique identifier of an article
    private int ID;
    private String Foodname;
    private int Cost;
    // Resource ID of associated image (e.g. R.drawable.my_image)
    private int imgaeDrawableID;
    private String deccription;


    public Food(int ID, String Foodname, int Cost, int imgaeDrawableID, String descripition) {
        this.ID = ID;
        this.Foodname = Foodname;
        this.Cost = Cost;
        this.imgaeDrawableID = imgaeDrawableID;
        this.deccription = descripition;
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

    public String getDeccription() {
        return deccription;
    }

    public void setDeccription(String deccription) {
        this.deccription = deccription;
    }
}
