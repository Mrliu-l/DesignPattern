# DesignPattern
java设计模式
一、工厂模式：
    1、简单工厂模式：
        优点：
            将创建对象的工作交给工厂，工厂统一管理，对外提供创建接口，用户无需关心创建过程。
        缺点：
            每次新增床架你对象，需要对工厂类进行扩展，违背开闭原则。
    2、工厂方法模式：
        优点：加入新的产品符合开闭原则，提高了系统的扩展性
        缺点：工厂子类较多，代码结构度变高；增加了系统的抽象性与理解性
    3、抽象工厂模式：
        优点：新增子产品时只需要增加自工厂即可，但新增产品属性时需要所有子产品变动
        缺点：不符合开闭原则
        
        
    