package com.MrLiu.fly.lazy;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 16:37
 * @Description: 描述: 静态内部类实现；线程安全，无锁，效率高。利用了内部静态类的加载机制
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        System.out.println("本类初始化");
    }

    public static LazyInnerClassSingleton getInastance(){
        System.out.println("调用内部类的对象");
        return lazyHolder.instance;
    }

    private static class lazyHolder{
        private static LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }

    public static void otherStaticMethod() {
        System.out.println("aa");
    }

}
