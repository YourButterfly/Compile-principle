package com.example.admin.myaspectj;

/**
 * Created by admin on 2017/5/28.
 */
public class NYCheesePizza extends Pizza {

    public NYCheesePizza(){
        name = "NYCheesePizza";
        dough = "Thin crust dough NYCheesePizza";
        sauce = "Marina sauce NYCheesePizza";
        toppings.add("Grated NYCheesePizza cheese");
    }

    public void cut(){
        System.out.println("cut it into NYCheesePizza slices");
    }
}