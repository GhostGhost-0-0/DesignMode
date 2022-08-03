package com.zzx.proxy;


import com.zzx.proxy.cglib.CglibProxy;
import com.zzx.proxy.jdk.Subject;
import com.zzx.proxy.jdk.SubjectImpl;
import com.zzx.proxy.jdk.TestProxy;
import net.sf.cglib.proxy.Enhancer;

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

        Subject proxy = JDKProxy(subject);
        proxy.test();       // 比如现在我们调用代理类的 test 方法，那么就会进入到我们上面 TestProxy 中 invoke 方法，走我们的代理逻辑

        Subject cglibProxy = CGLibProxy(subject);
        cglibProxy.test();  // 调用代理类的test方法
    }

    /**
     * 使用 JDK 的动态代理
     * @param subject 目标类
     * @return 代理对象
     */
    public static Subject JDKProxy(Subject subject) {
        InvocationHandler handler = new TestProxy(subject);
        return (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),    // 需要传入被代理的类的类加载器
                subject.getClass().getInterfaces(),     // 需要传入被代理的类的接口列表
                handler);   // 最后传入我们实现的代理处理逻辑实现类
        // 最后返回创建的代理对象
    }

    /**
     * 使用 CGLib 的动态代理
     * @param subject 目标类
     * @return 代理对象
     */
    public static Subject CGLibProxy(Subject subject) {
        Enhancer enhancer = new Enhancer();         // 增强器，一会就需要依靠增强器来为我们生成动态代理对象
        enhancer.setSuperclass(subject.getClass());     // 直接选择我们需要代理的类型，直接不需要接口或是抽象类，SuperClass 作为代理类的父类存在，这样我们就可以按照指定类型的方式去操作代理类了
        enhancer.setCallback(new CglibProxy(subject));  // 设定我们刚刚编写好的代理逻辑
        return (Subject) enhancer.create();
    }
}
