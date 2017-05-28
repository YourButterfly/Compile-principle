package com.example.admin.myaspectj;

/**
 * Created by admin on 2017/5/28.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYCheesePizza();
        }else if(type.equals("veggle")){
            pizza = new NYVegglePizza();
        }
        return pizza;
    }
}
