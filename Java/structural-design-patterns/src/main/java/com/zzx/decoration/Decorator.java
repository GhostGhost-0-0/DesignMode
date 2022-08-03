package com.zzx.decoration;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.decoration
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:52
 * @Description: 装饰着，装饰者需要将装饰目标组合到类中
 * @Version: 1.0
 */
public class Decorator extends Base{

    protected Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    @Override
    public void test() {
        base.test(); // 这里暂时还是使用目标的原本方法实现
    }
}
