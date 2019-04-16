package com.MrLiu.fly.hungry;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 11:27
 * @Description: 描述:单例—饿汉模式； 缺点：不管是否用到，都会在系统启动时实例化一个对象。
 */
public class HungrySingleton {
    //静态字段会在类加载时进行实例化
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    //私有化构造方法
    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
