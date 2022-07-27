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
    private static volatile Singleton LAZY_STYLE_INSTANCE;

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
     * synchronized 避免线程安全问题
     * @return Singleton
     */
    public static Singleton getLazyStyleInstance() {
        if (LAZY_STYLE_INSTANCE == null) {
            // 将 synchronized 加在这一步上，优化效率
            // 但这样又会有问题，因为这样还是有可能多个线程同时判断为 null 而进入等锁的状态
            synchronized (Singleton.class) {
                // 内层还要进行一次检查，双重检查锁定
                if (LAZY_STYLE_INSTANCE == null)
                    LAZY_STYLE_INSTANCE = new Singleton();
            }
        }
        return LAZY_STYLE_INSTANCE;
    }
}
