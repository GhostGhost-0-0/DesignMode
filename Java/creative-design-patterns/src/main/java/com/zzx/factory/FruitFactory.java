package com.zzx.factory;

import com.zzx.factory.entity.Apple;
import com.zzx.factory.entity.Fruit;
import com.zzx.factory.entity.Orange;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:31
 * @Description: 水果工厂类
 * @Version: 1.0
 */
public class FruitFactory {

    /**
     * 这里就直接来一个静态方法根据指定类型进行创建
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
}
