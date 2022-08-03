package com.zzx.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy.jdk
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 18:02
 * @Description: 通过 JDK 的动态代理实现
 * @Version: 1.0
 */
public class TestProxy implements InvocationHandler {

    private final Object object;    // 这里需要保存一下被代理的对象，下面需要用到

    public TestProxy(Object object) {
        this.object = object;
    }


    @Override   // 此方法就是调用代理对象的对应方法时会进入，这里我们就需要编写如何进行代理了
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method 就是调用的代理对象的哪一个方法，args 是实参数组
        System.out.println("代理对象：" + proxy.getClass()); // proxy 就是生成的代理对象了，我们看看是什么类型的
        Object res = method.invoke(object, args);   // 在代理中调用被代理对象原本的方法，因为你是代理，还是得执行一下别人的业务，当然也可以不执行，但是这样就失去代理的意义了，注意要用上面的 object
        System.out.println("方法调用完成，返回值为：" +  res);
        return res; // 返回返回值
    }
}
