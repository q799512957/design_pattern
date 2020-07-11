package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:20
 * 双重锁校验
 */
public class Singleton6 {
    private Singleton6(){}

    private static volatile Singleton6 singleton6;
    
    /**
     *
     *  
     * @author chip
     * @date 2020/7/10 17:23 
     * @return com.learn.design_pattern.singleton.Singleton6
     * 第一个if进入后锁住对象，再进行判断，即使在多线程情况下也可保证线程同步，并且同步代码块之后都不会执行，提高效率
     */
    public static Singleton6 getSingleton6(){
        if(singleton6==null){
            synchronized (Singleton6.class){
                if(singleton6==null){
                    singleton6=new Singleton6();
                }
            }
        }
        return singleton6;
    }
}
