package com.example.admin.myaspectj;

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myaspectj.anno.TestAspectJ;

import java.util.stream.Stream;

public class MainActivity extends AppCompatActivity {
    public Button btn;
    public TextView PizzaType;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inint();
        verifyStoragePermissions(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PizzaStoreTest(PizzaType.getText().toString());
            }
        });
    }


    @TestAspectJ(eventName = "Store")
    public  void PizzaStoreTest (String food) {
        Pizza pizza=new Pizza();
        if(food.equals("sty1")){
            sty1(pizza);
        }else if(food.equals("sty2")){
            sty2(pizza);
        }else if(food.equals("sty3")){
            sty3(pizza);
        }else if(food.equals("sty4")){
            sty4(pizza);
        }else if(food.equals("sty5")){
            sty5(pizza);
        }else if(food.equals("sty6")){
            sty6(pizza);
        }else if(food.equals("sty7")){
            sty7(pizza);
        }else if(food.equals("sty8")){
            sty8(pizza);
        }else if(food.equals("sty9")){
            sty9(pizza);
        }else if(food.equals("sty10")){
            sty10(pizza);
        }else if(food.equals("sty11")){
            sty11(pizza);
        }else if(food.equals("sty12")){
            sty12(pizza);
        }else if(food.equals("sty13")){
            sty13(pizza);
        }else if(food.equals("sty14")){
            sty14(pizza);
        }else if(food.equals("sty15")){
            sty15(pizza);
        }else if(food.equals("sty16")){
            sty16(pizza);
        }else if(food.equals("sty17")){
            sty17(pizza);
        }else if(food.equals("sty18")){
            sty18(pizza);
        }else if(food.equals("sty19")){
            sty19(pizza);
        }else if(food.equals("sty20")){
            sty20(pizza);
        }

    }
    @TestAspectJ(eventName = "Store")
    public  void sty1(Pizza pizza){
        pizza.add1=add1();
        pizza.add2=add2();
        pizza.add3=add3();
    }
    public  void sty2(Pizza pizza){
        pizza.add2=add2();
        pizza.add3=add3();
        pizza.add4=add4();
    }
    public  void sty3(Pizza pizza){
        pizza.add3=add3();
        pizza.add4=add4();
        pizza.add5=add5();
    }
    public  void sty4(Pizza pizza){
        pizza.add4=add4();
        pizza.add5=add5();
        pizza.add6=add6();
    }
    public  void sty5(Pizza pizza){
        pizza.add5=add5();
        pizza.add6=add6();
        pizza.add7=add7();
    }
    public  void sty6(Pizza pizza){
        pizza.add6=add6();
        pizza.add7=add7();
        pizza.add8=add8();
    }
    public  void sty7(Pizza pizza){
        pizza.add7=add7();
        pizza.add8=add8();
        pizza.add9=add9();
    }
    public  void sty8(Pizza pizza){
        pizza.add8=add8();
        pizza.add9=add9();
        pizza.add10=add10();
    }
    public  void sty9(Pizza pizza){
        pizza.add1=add1();
        pizza.add9=add9();
        pizza.add10=add10();
    }
    public  void sty10(Pizza pizza){
        pizza.add1=add1();
        pizza.add2=add2();
        pizza.add10=add10();
    }
    public  void sty11(Pizza pizza){
        pizza.add1=add1();
        pizza.add3=add3();
        pizza.add5=add5();
    }
    public  void sty12(Pizza pizza){
        pizza.add2=add2();
        pizza.add4=add4();
        pizza.add6=add6();
    }
    public  void sty13(Pizza pizza){
        pizza.add3=add3();
        pizza.add5=add5();
        pizza.add7=add7();
    }
    public  void sty14(Pizza pizza){
        pizza.add4=add4();
        pizza.add6=add6();
        pizza.add8=add8();
    }
    public  void sty15(Pizza pizza){
        pizza.add5=add5();
        pizza.add7=add7();
        pizza.add9=add9();
    }
    public  void sty16(Pizza pizza){
        pizza.add6=add6();
        pizza.add8=add8();
        pizza.add10=add10();
    }
    public  void sty17(Pizza pizza){
        pizza.add1=add1();
        pizza.add7=add7();
        pizza.add9=add9();
    }
    public  void sty18(Pizza pizza){
        pizza.add2=add2();
        pizza.add8=add8();
        pizza.add10=add10();
    }
    public  void sty19(Pizza pizza){
        pizza.add1=add1();
        pizza.add3=add3();
        pizza.add9=add9();
    }
    public  void sty20(Pizza pizza){
        pizza.add2=add2();
        pizza.add4=add4();
        pizza.add10=add10();
    }
    @TestAspectJ(eventName = "add1")
    public  int add1(){
        //Toast.makeText(MainActivity.this,"add1",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add2")
    public  int add2(){
        //Toast.makeText(MainActivity.this,"add2",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add3")
    public  int add3(){
        //Toast.makeText(MainActivity.this,"add3",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add4")
    public  int add4(){
        //Toast.makeText(MainActivity.this,"add4",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add5")
    public  int add5(){
        Toast.makeText(MainActivity.this,"add5",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add6")
    public  int add6(){
        Toast.makeText(MainActivity.this,"add6",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add7")
    public  int add7(){
        Toast.makeText(MainActivity.this,"add7",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add8")
    public  int add8(){
        Toast.makeText(MainActivity.this,"add8",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add9")
    public  int add9(){
        Toast.makeText(MainActivity.this,"add9",Toast.LENGTH_SHORT).show();
        return 1;
    }
    @TestAspectJ(eventName = "add10")
    public  int add10(){
        Toast.makeText(MainActivity.this,"add10",Toast.LENGTH_SHORT).show();
        return 1;
    }


    public void inint(){
        btn=(Button) findViewById(R.id.btn_order);
        PizzaType=(TextView)findViewById(R.id.editType);
    }

    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }
}
