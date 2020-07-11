package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:25
 * 静态内部类
 */
public class Singleton7 {
    private Singleton7(){}


    private static class SingletonClass{
        private static final Singleton7 INSTANCE=new Singleton7();
    }  
    
    /**
     *
     *  
     * @author chip
     * @date 2020/7/10 17:30 
     * @return com.learn.design_pattern.singleton.Singleton7
     * 外部类装载化时不会装载静态内部类
     * 调用方法时才会装载静态内部类，而装载静态内部类是jdk实现的，线程安全的
     */
    public static Singleton7 getSingleton7(){
        return SingletonClass.INSTANCE;
    }
}
