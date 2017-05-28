package com.example.myaspectj.anno;

import android.content.Context;
import android.widget.Toast;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by Administrator on 2016/9/2.
 */

@Aspect
public class TestAspect {

    @Pointcut("execution(@TestAspectJ public * *..*.*(..)) && @annotation(name)")
    public void testAspect(TestAspectJ name) {
    }

    @Before("testAspect(TestAspectJ)")
    public void testTestAspect(JoinPoint joinPoint) {
        Toast.makeText((Context) joinPoint.getTarget(),"OK",Toast.LENGTH_SHORT).show();

    }

}
