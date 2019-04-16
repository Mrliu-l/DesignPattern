package com.MrLiu.fly.lazy;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 16:41
 * @Description: 描述:测试静态内部类的加载方式;
 * 从测试结果看，调用静态方法时，静态内部类不会被初始化，只有调用内部静态类的方法时，才会初始化内部静态类的静态代码块
 */
public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {
        LazyInnerClassSingleton.otherStaticMethod();
        System.out.println("===============");
        LazyInnerClassSingleton.getInastance();
    }
}
