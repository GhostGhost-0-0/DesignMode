package com.zzx.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy.cglib
 * @Author: �Ǹ�С骹�
 * @CreateTime: 2022-08-03 22:00
 * @Description: ͨ�� CGLib �Ķ�̬����ʵ��
 * @Version: 1.0
 */
public class CglibProxy implements MethodInterceptor {

    private final Object target;

    public CglibProxy(Object object) {
        this.target = object;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("�������� CGLib ���д������" + obj.getClass());
        return method.invoke(target, args);      // Ҳ��ֱ�ӵ��ô������ķ�������
    }
}
