package com.MrLiu.fly.abstractFactory;

import com.MrLiu.fly.abstractFactory.model.INode;
import com.MrLiu.fly.abstractFactory.model.IVideo;
import com.MrLiu.fly.abstractFactory.model.PythonNode;
import com.MrLiu.fly.model.ICourse;
import com.MrLiu.fly.model.PythonCourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 11:26
 * @Description: 描述:
 */
public class PythonCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INode createNode() {
        return new PythonNode();
    }

    @Override
    public IVideo createVideo() {
        return null;
    }
}
