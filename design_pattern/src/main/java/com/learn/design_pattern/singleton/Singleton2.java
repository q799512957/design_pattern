package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:01
 *  饿汉模式第二种（静态代码块）
 */
public class Singleton2 {
    private Singleton2(){}

    private static Singleton2 singleton2;

    static {
        singleton2=new Singleton2();
    }

    public static Singleton2 getSingleton2(){
        return singleton2;
    }
}
