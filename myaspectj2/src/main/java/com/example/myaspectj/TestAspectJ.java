package com.example.myaspectj;

import android.annotation.TargetApi;
import android.os.Build;
import android.util.Log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Administrator on 2016/9/2.
 */
@Aspect
public class TestAspectJ {

    private static final String METHOD_EXECUTION = "execution(* *..MainActivity+.onCreate(..))";

    private static final String METHOD_CALL = "call(* *..MainActivity+.test(..))";

    private String TAG = "YourButterfly";

    @Before(METHOD_CALL)
    public void class1(JoinPoint joinPoint){
        Log.e(TAG,joinPoint.getArgs().clone()[0].toString());
    }

    @Pointcut(METHOD_EXECUTION)
    public void methodExecution() {

    }

    @Pointcut(METHOD_CALL)
    public void methodCall() {

    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Around("methodExecution()")
    public void aroundMethodExecution(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        String result = "-----------------------------MethodExecution";
        Log.e(TAG, result);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Around("methodCall()")
    public Object arouneMethodCall(ProceedingJoinPoint joinPoint){
        String name = "qqq";
        Log.e(TAG,name);
        return name;
    }

}
