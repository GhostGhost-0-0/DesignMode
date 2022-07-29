package com.zzx.adapter;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.adapter
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 15:41
 * @Description: 主方法测试
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        TestAdapter testAdapter = new TestAdapter();
        ObjectAdapter objectAdapter = new ObjectAdapter(new TestSupplier());
        test(objectAdapter);
    }

    public static void test(Target target) {
        System.out.println("成功得到" + target.supply());
    }
}
