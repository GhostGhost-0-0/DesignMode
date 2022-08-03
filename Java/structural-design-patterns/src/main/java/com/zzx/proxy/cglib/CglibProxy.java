package com.zzx.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy.cglib
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 22:00
 * @Description: 通过 CGLib 的动态代理实现
 * @Version: 1.0
 */
public class CglibProxy implements MethodInterceptor {

    private final Object target;

    public CglibProxy(Object object) {
        this.target = object;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("现在是由 CGLib 进行代理操作" + obj.getClass());
        return method.invoke(target, args);      // 也是直接调用代理对象的方法即可
    }
}
