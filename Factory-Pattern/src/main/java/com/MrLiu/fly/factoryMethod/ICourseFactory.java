package com.MrLiu.fly.factoryMethod;

import com.MrLiu.fly.model.ICourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:43
 * @Description: 描述:工厂方法模式接口
 */
public interface ICourseFactory {
    public ICourse create();
}
