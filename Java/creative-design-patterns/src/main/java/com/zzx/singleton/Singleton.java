package com.zzx.singleton;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.singleton
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-27 15:55
 * @Description: 单例类
 * @Version: 1.0
 */
public class Singleton {

    private final static Singleton HUNGRY_STYLE_INSTANCE = new Singleton();
    private static Singleton LAZY_STYLE_INSTANCE;

    private Singleton() {}

    /**
     * 获取饿汉式单例
     * @return Singleton
     */
    public static Singleton getHungryStyleInstance() {
        return HUNGRY_STYLE_INSTANCE;
    }

    /**
     * 获取懒汉式单例
     * @return Singleton
     */
    public static Singleton getLazyStyleInstance() {
        if (LAZY_STYLE_INSTANCE == null) {
            LAZY_STYLE_INSTANCE = new Singleton();
        }
        return LAZY_STYLE_INSTANCE;
    }
}
