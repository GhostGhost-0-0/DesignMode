package com.zzx.factory;

import com.zzx.factory.entity.Orange;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:59
 * @Description: 橘子工厂类，负责生成橘子
 * @Version: 1.0
 */
public class OrangeFactory extends FruitFactory<Orange>{

    @Override
    public Orange getFruitByFactory() {
        return new Orange("橘子");
    }
}
