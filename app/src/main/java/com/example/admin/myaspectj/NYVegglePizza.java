package com.example.admin.myaspectj;

/**
 * Created by admin on 2017/5/28.
 */
public class NYVegglePizza extends Pizza {

    public NYVegglePizza(){
        name = "NYVegglePizza";
        dough = "Thin crust dough NYVegglePizza";
        sauce = "Marina sauce NYVegglePizza";
        toppings.add("Grated NYVegglePizza cheese");
    }

    public void cut(){
        System.out.println("cut it into NYVegglePizza slices");
    }
}