package com.zzx.proxy;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.proxy
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-08-03 17:55
 * @Description: 目标实现类
 * @Version: 1.0
 */
public class SubjectImpl extends Subject{

    @Override
    public void test() {
        System.out.println("我是测试方法!");
    }
}
