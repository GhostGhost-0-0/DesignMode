package com.zzx.proxy;


import com.zzx.proxy.jdk.Subject;
import com.zzx.proxy.jdk.SubjectImpl;
import com.zzx.proxy.jdk.TestProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 18:08
 * @Description: 代理模式测试
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();    // 被代理的大冤种
        InvocationHandler handler = new TestProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),    // 需要传入被代理的类的类加载器
                subject.getClass().getInterfaces(),     // 需要传入被代理的类的接口列表
                handler);   // 最后传入我们实现的代理处理逻辑实现类
        proxy.test();       // 比如现在我们调用代理类的 test 方法，那么就会进入到我们上面 TestProxy 中 invoke 方法，走我们的代理逻辑
    }
}
