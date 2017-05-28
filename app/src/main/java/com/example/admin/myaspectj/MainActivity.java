package com.example.admin.myaspectj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.myaspectj.anno.TestAspectJ;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView PizzaType;
    public ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inint();
        PizzaStoreTest(PizzaType.toString());
    }
    @TestAspectJ(eventName = "dogg")
    public void test(String strings){
        String dog = strings;
    }

    public static void PizzaStoreTest (String food) {

        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza(food);
        pizza = pizzaStore.orderPizza(food);

    }

    public void inint(){
        btn=(Button) findViewById(R.id.btn_order);
        PizzaType=(TextView)findViewById(R.id.editType);
        listView=(ListView)findViewById(R.id.listView);
    }
}
