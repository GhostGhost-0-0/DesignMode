package com.zzx.proxy.jdk;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy.jdk
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 18:01
 * @Description: 目标接口实现类
 * @Version: 1.0
 */
public class SubjectImpl implements Subject{

    @Override
    public void test() {
        System.out.println("我是测试方法！");
    }
}
