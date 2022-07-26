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

    @Test
    public void test() {
        Apple apple = new Apple("苹果");
        Orange orange = new Orange("橘子");
        System.out.println(apple.toString());
        System.out.println(orange.toString());
    }

    @Test
    public void simpleFactoryTest() {
        Apple apple = (Apple) FruitFactory.getFruit("苹果");
        Orange orange = (Orange) FruitFactory.getFruit("橘子");
        System.out.println(apple.toString());
    }
}
