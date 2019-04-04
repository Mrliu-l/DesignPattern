package com.MrLiu.fly.abstractFactory;

import com.MrLiu.fly.abstractFactory.model.INode;
import com.MrLiu.fly.abstractFactory.model.IVideo;
import com.MrLiu.fly.abstractFactory.model.JavaNode;
import com.MrLiu.fly.model.ICourse;
import com.MrLiu.fly.model.JavaCourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 11:22
 * @Description: 描述:
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INode createNode() {
        return new JavaNode();
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
