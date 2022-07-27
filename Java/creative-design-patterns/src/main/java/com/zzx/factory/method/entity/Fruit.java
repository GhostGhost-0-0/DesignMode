package com.zzx.factory.method.entity;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.factory.entity
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-26 17:07
 * @Description: 水果抽象类
 * @Version: 1.0
 */
public abstract class Fruit {

    private String name;


    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + "@" + hashCode(); // 打印一下当前水果名称，还有对象的 hashCode
    }
}
