package com.zzx.proxy;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 17:56
 * @Description: 代理类
 * @Version: 1.0
 */
public class Proxy extends Subject{

    Subject target;

    public Proxy(Subject subject) {
        this.target = subject;
    }

    @Override
    public void test() {
        System.out.println("代理前绕方法");
        target.test();
        System.out.println("代理后绕方法");
    }
}
