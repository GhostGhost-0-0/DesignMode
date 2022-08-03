package com.zzx.decoration;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.decoration
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:53
 * @Description: 装饰实现
 * @Version: 1.0
 */
public class DecoratorImpl extends Decorator{

    public DecoratorImpl(Base base) {
        super(base);
    }

    /**
     * 对原本的方法进行装饰，我们可以在前后都去添加额外操作
     */
    @Override
    public void test() {
        System.out.println("装饰方法：我是操作前逻辑");
        super.test();
        System.out.println("装饰方法：我是操作后逻辑");
    }
}
