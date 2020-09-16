package com.baomw.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ����:
 *
 */
@Component
@Aspect
public class PointCutE {

    @Pointcut("execution(* com.baomw.dao.*.*(..))")
    public void beforePointCut(){
    }
    @Pointcut("execution(* com.baomw.dao.*.*(..))")
    public void afterPointCut(){
    }


    @After("afterPointCut()")
    public void after(){
        System.out.println("afterִ��");
    }

    @Before("beforePointCut()")
    public void before(){
        System.out.println("beforeִ��");
    }

}
