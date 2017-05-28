package com.example.admin.myaspectj;

/**
 * Created by admin on 2017/5/28.
 */
import java.util.ArrayList;

public abstract class Pizza {

    String name;    //名称
    String dough;   //面团类型
    String sauce;   //酱料类型
    ArrayList toppings = new ArrayList(); //一套佐料
    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossign dough..." + dough);
        System.out.println("Adding sauce..." + sauce);
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(" " + toppings.get(i));

        }

    }
    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Pizza in offical PizzaStrore box");
    }
    public String getName(){
        return name;
    }
}