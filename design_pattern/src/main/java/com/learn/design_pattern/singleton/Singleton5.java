package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:17
 * 懒汉模式第三种
 */
public class Singleton5 {
    private Singleton5(){}

    private static Singleton5 singleton5;

    /**
     *
     *  
     * @author chip
     * @date 2020/7/10 17:19
     * @return com.learn.design_pattern.singleton.Singleton5
     * 两个线程同时通过if判断，即使上锁也会创建两个不同的对象，线程不安全
     */
    public static Singleton5 getSingleton5(){
        if(singleton5==null){
            synchronized (Singleton5.class){
                singleton5=new Singleton5();
            }
        }
        return singleton5;
    }
}
