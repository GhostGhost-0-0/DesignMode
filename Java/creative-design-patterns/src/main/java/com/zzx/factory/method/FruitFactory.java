package com.zzx.factory.method;

import com.zzx.factory.method.entity.Apple;
import com.zzx.factory.method.entity.Fruit;
import com.zzx.factory.method.entity.Orange;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:31
 * @Description: 水果工厂类
 * @Version: 1.0
 */
public abstract class FruitFactory<T extends Fruit>{

    /**
     * 这里就直接来一个静态方法根据指定类型进行创建，但是不符合开闭原则
     * 想要增加水果种类只能通过修改工厂类，扩展性不好
     * @param type 水果类型
     * @return 对应的水果对象
     */
    public static Fruit getFruit(String type) {
        switch (type) {
            case "苹果":
                return new Apple(type);
            case "橘子":
                return new Orange(type);
            default:
                return null;
        }
    }

    /**
     * 改进后的工厂方法，通过对应的水果工厂生成水果，不直接修改工厂类
     * 增加水果种类只需添加对应的水果工厂即可，符合开闭原则
     * @return 对应的水果
     */
    public abstract T getFruitByFactory();
}
