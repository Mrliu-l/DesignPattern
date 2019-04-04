package com.MrLiu.fly.simpleFactory;

import com.MrLiu.fly.model.CCourse;
import com.MrLiu.fly.model.ICourse;
import com.MrLiu.fly.model.JavaCourse;
import com.MrLiu.fly.model.PythonCourse;
import org.junit.Test;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:16
 * @Description: 描述:简单工厂测试类
 */
public class SimpleFactoryTest {

    @Test
    public void createByNameTest() {
        ICourse javaCourse = CourseFactory.create("java");
        javaCourse.record();
        ICourse cCourse = CourseFactory.create("c");
        cCourse.record();
        ICourse pythonCourse = CourseFactory.create("python");
        pythonCourse.record();
    }

    @Test
    public void createByClass(){
        ICourse javaCourse = CourseFactory.createByClass(JavaCourse.class);
        javaCourse.record();
        ICourse cCourse = CourseFactory.createByClass(CCourse.class);
        cCourse.record();
        ICourse pythonCourse = CourseFactory.createByClass(PythonCourse.class);
        pythonCourse.record();
    }
}
