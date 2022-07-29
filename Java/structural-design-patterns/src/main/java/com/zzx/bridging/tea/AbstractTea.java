package com.zzx.bridging.tea;

import com.zzx.bridging.size.Size;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.bridging
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 15:56
 * @Description: 奶茶基本抽象类
 * @Version: 1.0
 */
public abstract class AbstractTea {

    protected Size size; //尺寸作为桥接属性存放在类中

    /**
     * 在构造时需要知道尺寸属性
     * @param size 尺寸
     */
    protected AbstractTea(Size size) {
        this.size = size;
    }

    /**
     * 具体类型依然是由子类决定
     * @return 奶茶的类型
     */
    public abstract String getType();
}
