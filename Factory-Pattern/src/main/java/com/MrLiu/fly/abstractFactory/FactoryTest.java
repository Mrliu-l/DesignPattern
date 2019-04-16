package com.MrLiu.fly.abstractFactory;

import com.MrLiu.fly.abstractFactory.model.INode;
import com.MrLiu.fly.model.ICourse;
import org.junit.Test;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 11:27
 * @Description: 描述:测试
 */
public class FactoryTest {

    @Test
    public void test(){
        ICourseFactory javaCourseFactory = new JavaCourseFactory();
        ICourse javaCourse = javaCourseFactory.createCourse();
        javaCourse.record();
        INode javaNode = javaCourseFactory.createNode();
        javaNode.node();
        ICourseFactory pythonCourseFactory = new PythonCourseFactory();
        ICourse pythonCourse = pythonCourseFactory.createCourse();
        pythonCourse.record();
        INode pythonNode = pythonCourseFactory.createNode();
        pythonNode.node();
    }
}
