package com.MrLiu.fly.factoryMethod;

import com.MrLiu.fly.model.ICourse;
import com.MrLiu.fly.model.JavaCourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:45
 * @Description: 描述:
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
