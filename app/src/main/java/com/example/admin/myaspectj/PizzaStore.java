package com.example.admin.myaspectj;

/**
 * Created by admin on 2017/5/28.
 */
public abstract  class PizzaStore {
    public final Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;

    }
    abstract Pizza createPizza(String type);
}
