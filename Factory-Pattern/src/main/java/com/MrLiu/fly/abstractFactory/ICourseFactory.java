package com.MrLiu.fly.abstractFactory;

import com.MrLiu.fly.abstractFactory.model.INode;
import com.MrLiu.fly.abstractFactory.model.IVideo;
import com.MrLiu.fly.model.ICourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 11:20
 * @Description: 描述:一个品牌的抽象，所有此类的产品均实现次接口
 */
public interface ICourseFactory {
    ICourse createCourse();
    INode createNode();
    IVideo createVideo();
}
