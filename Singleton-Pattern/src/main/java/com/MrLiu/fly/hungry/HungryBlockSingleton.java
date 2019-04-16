package com.MrLiu.fly.hungry;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 11:32
 * @Description: 描述:单例—饿汉模式（在静态代码块中初始化）； 缺点：不管是否用到，都会在系统启动时实例化一个对象。
 */
public class HungryBlockSingleton {

    private static final HungryBlockSingleton singleton;

    static {
        singleton = new HungryBlockSingleton();
    }

    private HungryBlockSingleton(){};

    public static HungryBlockSingleton getInstance(){
        return singleton;
    }
}
