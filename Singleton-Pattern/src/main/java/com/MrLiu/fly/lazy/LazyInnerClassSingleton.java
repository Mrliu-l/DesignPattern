package com.MrLiu.fly.lazy;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 16:37
 * @Description: 描述: 静态内部类实现；线程安全，无锁，效率高。利用了内部静态类的加载机制
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        //防止利用反射创建对象
        if(lazyHolder.instance != null){
            throw new RuntimeException("不允许构建多个实例");
        }
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

    //防止反序列化创建单例
    //通过序列化时，会先创建实例，然后通过此方法判断返回的具体实例，故在此重写此方法即可
    private Object readResolve(){
        return lazyHolder.instance;
    }

}
