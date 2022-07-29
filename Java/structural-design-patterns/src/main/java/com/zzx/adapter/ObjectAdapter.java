package com.zzx.adapter;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.adapter
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 15:48
 * @Description: 对象适配器
 * @Version: 1.0
 */
public class ObjectAdapter implements Target{

    TestSupplier testSupplier;

    public ObjectAdapter(TestSupplier testSupplier) {
        this.testSupplier = testSupplier;
    }

    @Override
    public String supply() {
        return testSupplier.doSupply();
    }
}
