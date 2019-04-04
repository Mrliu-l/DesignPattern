package com.MrLiu.fly.factoryMethod;

import com.MrLiu.fly.model.CCourse;
import com.MrLiu.fly.model.ICourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:47
 * @Description: 描述:
 */
public class CCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return new CCourse();
    }
}
