package com.zzx.factory;

import com.zzx.factory.entity.Apple;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:55
 * @Description: 苹果工厂类，负责生成苹果
 * @Version: 1.0
 */
public class AppleFactory extends FruitFactory<Apple>{

    @Override
    public Apple getFruitByFactory() {
        return new Apple("苹果");
    }
}
