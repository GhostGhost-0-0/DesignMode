package com.zzx.proxy;


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
        Subject subject = new SubjectImpl();
        Proxy proxy = new Proxy(subject);
        proxy.test();
    }
}
