package com.MrLiu.fly.factoryMethod;

import com.MrLiu.fly.model.ICourse;
import org.junit.Test;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:47
 * @Description: 描述:工厂方法模式测试类
 */
public class FactoryMethodTest {

    @Test
    public void test(){
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.create();
        javaCourse.record();
    }
}
