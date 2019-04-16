package com.MrLiu.fly.lazy;

/**
 * @author liu_l
 * @email: liu_lei_programmer@163.com
 * @time 2019/4/16 15:56
 * @Description: 描述: 懒汉模式+双重校验
 */
public class LazyDoubleCheckSingleton {

    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){};

    public static LazyDoubleCheckSingleton getInstance(){
        if(singleton == null){//#1
            synchronized (LazyDoubleCheckSingleton.class){//#2
                if(singleton == null){//#3
                    singleton = new LazyDoubleCheckSingleton();//#4
                    //JVM类加载机制分为五个部分：加载，验证，准备，解析，初始化
                    //CPU执行时会将字节码转换为JVM指令执行
                    //1、分配内存给这个对象
                    //2、初始化对象
                    //3、将初始化好的对象与内存建立关联关系、赋值
                    //4、用户初次访问
                    //其中2  3步有可能指令重排序
                    /**导致问题：
                     * 原因分析：
                     * 1. thread2进入#1， 这时子线程的singleton都是为空的，thread2让出CPU资源给thread3
                     * 2. thread3进入#1， 这时子线程的singleton都是为空的, thread3让出CPO资源给thread2
                     * 3. thread2会依次执行#2，#3，#4， 最终在thread2里面实例化了singleton。thread2执行完毕让出CPO资源给thread3
                     * 4. thread3接着#1跑下去，跑到#3的时候，由于#1里面拿到的singleton还是空（并没有及时从thread2里面拿到最新的），所以thread3仍然会执行#4，#5.1
                     * 5. 最后在thread2和thread3都实例化了singleton
                     */

                }
            }
        }
        return singleton;
    }
}
