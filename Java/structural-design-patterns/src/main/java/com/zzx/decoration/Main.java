package com.zzx.decoration;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.decoration
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:51
 * @Description: 装饰模式测试
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Base base = new BaseImpl();
        Decorator decorator = new DecoratorImpl(base);
        Decorator outer = new DecoratorImpl(decorator);

        decorator.test();
        outer.test();
    }
}
