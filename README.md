# DesignPattern(java设计模式)
一、工厂模式：
-
>   1、简单工厂模式_simpleFactory：      
>>      优点：将创建对象的工作交给工厂，工厂统一管理，对外提供创建接口，用户无需关心创建过程。
>>      缺点：每次新增床架你对象，需要对工厂类进行扩展，违背开闭原则。
>   2、工厂方法模式_factoryMethord：
>>      优点：加入新的产品符合开闭原则，提高了系统的扩展性
>>      缺点：工厂子类较多，代码结构度变高；增加了系统的抽象性与理解性
>   3、抽象工厂模式_abstractFactory：
>>      优点：新增子产品时只需要增加自工厂即可，但新增产品属性时需要所有子产品变动
>>      缺点：不符合开闭原则
二、单例模式：
-
>   1、饿汉模式_hungry
>>      优点：static + final可以保证绝对的单例
>>      缺点：由于是静态字段或静态代码块实现，故只要调用该类中的任意静态方法，会实例化多有的静态属性。故如果没有用到该对象也会实例化
>   2、懒汉模式_lazy.LazySingleton
>>      缺点：多线程下仍会创建多个实例
>   3、懒汉模式_lazy.LazyDoubleCheckSingleton（双重锁）——常用
>>      优点：保证了一定是单例
>>      缺点: 但由于使用到synchronize锁机制，故会影响效率
>>      注意：1、使用线程断点进行验证多线程下是否创建多个对象；
>>            2、使用volatile关键字是因为CPU在执行指令时会出现字节码重组与多核CPU间数据一致性问题，故需要使用该字段
>   4、懒汉模式_lazy.LazyInnerClassSingleton（静态内部类实现）——常用
>>      优点：无锁、效率高；避免了饿汉模式中的弊端，只有在调用时才会产生该单例对象
>>      注意：需要理解的时静态内部类的加载机制
>   其中以上几种：利用序列化（通过重写readResolve方法）与反射（通过构造方法中判断）可以破坏单例模式;解决方案可参照LazyInnerClassSingleton中解释
>   5、注册式单例—spring工厂模式
        
        
    