package com.example.myaspectj;

import android.Manifest;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.util.Log;

import com.example.myaspectj.anno.TestAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * Created by Administrator on 2016/9/2.
 */
@Aspect
public class TestAspectJ {

    private static final String METHOD_EXECUTION = "execution(* *..MainActivity+.onCreate(..))";

    private static final String METHOD_CALL = "call(* *..MainActivity+.PizzaStoreTest(..))";
    private static final String ALL_EXECUTION="execution(* *..MainActivity.*(..))";
    private String TAG = "YourButterfly";

    @Before(METHOD_CALL)
    public void test(JoinPoint joinPoint){
        Log.e(TAG,joinPoint.getSignature().toString());
    }

    @Before(ALL_EXECUTION)
    public void allExecution(JoinPoint joinPoint){
        String tmp=joinPoint.getSignature().getName();
        if(tmp.equals("sty1")){
            writeFile("1 1 1 0 0 0 0 0 0 0");
        }
        else if(tmp.equals("sty2")){
            writeFile("0 1 1 1 0 0 0 0 0 0");
        }
        else if(tmp.equals("sty3")){
            writeFile("0 0 1 1 1 0 0 0 0 0");
        }
        else if(tmp.equals("sty4")){
            writeFile("0 0 0 1 1 1 0 0 0 0");
        }
        else if(tmp.equals("sty5")){
            writeFile("0 0 0 0 1 1 1 0 0 0");
        }
        else if(tmp.equals("sty6")){
            writeFile("0 0 0 0 0 1 1 1 0 0");
        }
        else if(tmp.equals("sty7")){
            writeFile("0 0 0 0 0 0 1 1 1 0");
        }
        else if(tmp.equals("sty8")){
            writeFile("0 0 0 0 0 0 0 1 1 1");
        }
        else if(tmp.equals("sty9")){
            writeFile("1 0 0 0 0 0 0 0 1 1");
        }
        else if(tmp.equals("sty10")){
            writeFile("1 1 0 0 0 0 0 0 0 1");
        }
        else if(tmp.equals("sty11")){
            writeFile("1 0 1 0 1 0 0 0 0 0");
        }
        else if(tmp.equals("sty12")){
            writeFile("0 1 0 1 0 1 0 0 0 0");
        }
        else if(tmp.equals("sty13")){
            writeFile("0 0 1 0 1 0 1 0 0 0");
        }
        else if(tmp.equals("sty14")){
            writeFile("0 0 0 1 0 1 0 1 0 0");
        }
        else if(tmp.equals("sty15")){
            writeFile("0 0 0 0 1 0 1 0 1 0");
        }
        else if(tmp.equals("sty16")){
            writeFile("0 0 0 0 0 1 0 1 0 1");
        }
        else if(tmp.equals("sty17")){
            writeFile("1 0 0 0 0 0 1 0 1 0");
        }
        else if(tmp.equals("sty18")){
            writeFile("0 1 0 0 0 0 0 1 0 1");
        }
        else if(tmp.equals("sty19")){
            writeFile("1 0 1 0 0 0 0 0 1 0");
        }
        else if(tmp.equals("sty20")){
            writeFile("0 1 0 1 0 0 0 0 0 1");
        }


        Log.e(TAG,joinPoint.getSignature().getName());
    }

    public static boolean isSdCardExist() {
        return Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED);
    }
    public static String getSdCardPath() {
        boolean exist = isSdCardExist();
        String sdpath = "";
        if (exist) {
            sdpath = Environment.getExternalStorageDirectory()
                    .getAbsolutePath();
        } else {
            sdpath = "不适用";
        }
        return sdpath;

    }
    public static String getDefaultFilePath() {
        String filepath = "";
        File file = new File(Environment.getExternalStorageDirectory(),
                "test.txt");
        if (file.exists()) {
            filepath = file.getAbsolutePath();
        } else {
            filepath = "不适用";
        }
        return filepath;
    }
    public static  void writeFile(String content){
        try {
            Log.e("test",getSdCardPath());
            Log.e("test",getDefaultFilePath());
            File file = new File(Environment.getExternalStorageDirectory(),
                    "test.txt");
            //第二个参数意义是说是否以append方式添加内容
            FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
            writer.write(content);
            writer.write("\r\n");
            writer.close();
            System.out.println("写入成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
