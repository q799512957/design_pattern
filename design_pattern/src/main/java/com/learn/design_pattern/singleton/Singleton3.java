package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:04
 * 懒汉模式第一种
 */
public class Singleton3 {
    private Singleton3(){}

    private static Singleton3 singleton3;

    /**
     *
     *  
     * @author chip
     * @date 2020/7/10 17:14 
     * @return com.learn.design_pattern.singleton.Singleton3
     * 两个线程同时通过if判断的情况下，线程不安全
     */
    public static Singleton3 singleton3(){
        if(singleton3==null){
            singleton3=new Singleton3();
        }
        return singleton3;
    }
}
