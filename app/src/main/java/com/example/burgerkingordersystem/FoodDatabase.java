package com.example.burgerkingordersystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FoodDatabase {
    public static Food getFoodById(int ID) {
        return food.get(ID);
    }
    public static ArrayList<Food> getAllMenu() {
        return new ArrayList<Food>((List) Arrays.asList(food.values().toArray()));
    }
    private static final HashMap<Integer, Food> food = new HashMap<>();

    static {
        food.put(1, new Food(
                1,
                "HD burger",
                12,
                R.drawable.food1,
                "asdfasdgwqrhg"

        ));

        food.put(2, new Food(
                2,
                "Pass Pasta",
                6,
                R.drawable.food2,
                "asdfasdgwqrhg"
                ));
        food.put(3, new Food(
                3,
                "Winner Chicken",
                9,
                R.drawable.food3,
                "asdfasdgwqrhg"
                ));
        food.put(4, new Food(
                4,
                "Review Pizza",
                15,
                R.drawable.food4,
                "asdfasdgwqrhg"
                ));
        food.put(5, new Food(
                5,
                "Fired Nood",
                15,
                R.drawable.food5,
                "asdfasdgwqrhg"
                ));
        food.put(6, new Food(
                6,
                "Chicken Breast",
                14,
                R.drawable.food6,
                "asdfasdgwqrhg"
                ));
        food.put(7, new Food(
                7,
                "Java Chip",
                7,
                R.drawable.food7,
                "asdfasdgwqrhg"
                ));
        food.put(8, new Food(
                8,
                "Lucking coffee",
                3,
                R.drawable.food8,
                "asdfasdgwqrhg"
                ));
        food.put(9, new Food(
                9,
                "Sweet Prok",
                15,
                R.drawable.food9,
                "asdfasdgwqrhg"
                ));
        food.put(10, new Food(
                10,
                "Spring Roll",
                5,
                R.drawable.food10,
                "asdfasdgwqrhg"
                ));
        food.put(11, new Food(
                11,
                "Hi HotPot",
                120,
                R.drawable.food11,
                "asdfasdgwqrhg"
                ));
        food.put(12, new Food(
                12,
                "chips",
                4,
                R.drawable.food12,
                "asdfasdgwqrhg"
                ));
        food.put(13, new Food(
                13,
                "Burger King",
                99,
                R.drawable.food13,
                "this is the most popular item in Burger King!!!"
                ));
        food.put(14, new Food(
                14,
                "BreakFast",
                7,
                R.drawable.food14,
                "asdfasdgwqrhg"
                ));
        food.put(15, new Food(
                15,
                "tips",
                1,
                R.drawable.food15,
                "asdfasdgwqrhg"
                ));


    }


}
