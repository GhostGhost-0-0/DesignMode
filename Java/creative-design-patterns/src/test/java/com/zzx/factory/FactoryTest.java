package com.zzx.factory;

import com.zzx.factory.entity.Apple;
import com.zzx.factory.entity.Orange;
import org.junit.jupiter.api.Test;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:12
 * @Description: 工厂方法模式和抽象工厂模式的测试
 * @Version: 1.0
 */

public class FactoryTest {

    /**
     * 正常地创建对象模式测试
     */
    @Test
    public void test() {
        Apple apple = new Apple("苹果");
        Orange orange = new Orange("橘子");
        System.out.println(apple.toString());
        System.out.println(orange.toString());
    }

    /**
     * 简单的工厂模式测试
     * 有局限性，扩展性不好，不符合开闭原则
     */
    @Test
    public void simpleFactoryTest() {
        Apple apple = (Apple) FruitFactory.getFruit("苹果");
        Orange orange = (Orange) FruitFactory.getFruit("橘子");
        System.out.println(apple.toString());
    }

    /**
     * 工厂方法模式测试，符合开闭原则
     * 扩展性好
     */
    @Test
    public void factoryMethodTest() {
        AppleFactory appleFactory = new AppleFactory();
        OrangeFactory orangeFactory = new OrangeFactory();
        System.out.println(appleFactory.getFruitByFactory().toString());
        System.out.println(orangeFactory.getFruitByFactory().toString());
    }
}
