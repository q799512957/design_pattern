package com.learn.design_pattern.singleton;

/**
 * TODO
 *
 * @author chip
 * @version 1.0
 * @date 2020/7/10 17:08
 * 懒汉式第二种
 */
public class Singleton4 {
    private Singleton4(){}

    private static Singleton4 singleton4;

    /**
     *
     *  
     * @author chip
     * @date 2020/7/10 17:15
     * @return com.learn.design_pattern.singleton.Singleton4
     * if判断只需进行一次就可以，之后一直锁住方法影响效率
     */
    public static synchronized Singleton4 getSingleton4(){
        if(singleton4==null){
            singleton4=new Singleton4();
        }
        return singleton4;
    }
}
