package com.example.burgerkingordersystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrderDatabase {
    public static Order getOrderById(int ID) {
        return order.get(ID);
    }
    public static ArrayList<Order> getAllOrder() {
        return new ArrayList<Order>((List) Arrays.asList(order.values().toArray()));
    }
    private static final HashMap<Integer, Order> order = new HashMap<>();

    static {
        order.put(1, new Order(
                1,
                "HD burger",
                12,
                R.drawable.food1,
                0

        ));

        order.put(2, new Order(
                2,
                "Pass Pasta",
                6,
                R.drawable.food2,
                0
        ));
        order.put(3, new Order(
                3,
                "Winner Chicken",
                9,
                R.drawable.food3,
                0
        ));
        order.put(4, new Order(
                4,
                "Review Pizza",
                15,
                R.drawable.food4,
                0
        ));
        order.put(5, new Order(
                5,
                "Fired Nood",
                15,
                R.drawable.food5,
                0
        ));
        order.put(6, new Order(
                6,
                "Chicken Breast",
                14,
                R.drawable.food6,
                0
        ));
        order.put(7, new Order(
                7,
                "Java Chip",
                7,
                R.drawable.food7,
                0
        ));
        order.put(8, new Order(
                8,
                "Lucking coffee",
                3,
                R.drawable.food8,
                0
        ));
        order.put(9, new Order(
                9,
                "Sweet Prok",
                15,
                R.drawable.food9,
                0
        ));
        order.put(10, new Order(
                10,
                "Spring Roll",
                5,
                R.drawable.food10,
                0
        ));
        order.put(11, new Order(
                11,
                "Hi HotPot",
                120,
                R.drawable.food11,
                0
        ));
        order.put(12, new Order(
                12,
                "chips",
                4,
                R.drawable.food12,
                0
        ));
        order.put(13, new Order(
                13,
                "Burger King",
                99,
                R.drawable.food13,
                0
        ));
        order.put(14, new Order(
                14,
                "BreakFast",
                7,
                R.drawable.food14,
                0
        ));
        order.put(15, new Order(
                15,
                "tips",
                1,
                R.drawable.food15,
                0
        ));


    }


}
