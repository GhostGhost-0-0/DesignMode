package com.zzx.combination;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.combination
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:45
 * @Description: 组合模式测试
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {

        // 新建一个外层目录
        Directory outer = new Directory();
        // 新建一个内层目录
        Directory inner = new Directory();

        // 往外层目录添加一个目录
        outer.addComponent(inner);
        // 往外层目录添加一个文件
        outer.addComponent(new File());

        // 往内层目录添加一个文件
        inner.addComponent(new File());
        // 再往内层目录添加一个文件
        inner.addComponent(new File());

        outer.test();
    }
}
