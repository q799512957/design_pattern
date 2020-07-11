package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 16:59
 * 饿汉模式第一种(静态常量)
 *
 */
public class Singleton1 {

    private Singleton1(){}

    private static final Singleton1 singleton1=new Singleton1();

    public static Singleton1 getSingleton1(){
        return singleton1;
    }
}
