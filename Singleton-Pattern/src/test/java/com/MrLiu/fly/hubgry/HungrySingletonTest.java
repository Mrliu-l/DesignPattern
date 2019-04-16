package com.MrLiu.fly.hubgry;

import com.MrLiu.fly.hungry.HungrySingleton;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 16:43
 * @Description: 描述: 测试发现只要调用HungrySingleton类中的任何静态方法，其他静态代码块均会被初始化
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        HungrySingleton.otherStaticMethod();
    }
}
