package com.MrLiu.fly.simpleFactory;

import com.MrLiu.fly.model.CCourse;
import com.MrLiu.fly.model.ICourse;
import com.MrLiu.fly.model.JavaCourse;
import com.MrLiu.fly.model.PythonCourse;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/4 10:12
 * @Description: 描述:简单工厂
 */
public class CourseFactory {

    public static ICourse create(String name) {
        switch (name) {
            case "java":
                return new JavaCourse();
            case "python":
                return new PythonCourse();
            case "c":
                return new CCourse();
            default:
                return null;
        }
    }
    /**
     * @author liu_l
     * @created 2019/4/4 10:23
     * @email: liu_lei_programmer@163.com
     * @param clazz : 需要创建的class
     * @return com.MrLiu.fly.model.ICourse ：
     * TODO 简要描述方法的作用：
        通过需要创建的对象class创建实体类
     * TODO(这里描述这个方法适用条件 – 可选)
        仅使用非final且拥有无参构造方法的类，有参构造方法需要单独定义反射方法
     */
    public static ICourse createByClass(Class clazz){
        try {
            ICourse course = (ICourse) clazz.newInstance();
            return course;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
