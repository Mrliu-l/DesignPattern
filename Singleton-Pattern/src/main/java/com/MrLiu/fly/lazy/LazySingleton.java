package com.MrLiu.fly.lazy;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 11:37
 * @Description: 描述:单例模式—懒汉模式; 缺点：非线程安全
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton(){};

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
