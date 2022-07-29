package com.zzx.adapter;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.adapter
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 15:44
 * @Description: 手机供应商适配器
 * @Version: 1.0
 */
public class TestAdapter extends TestSupplier implements Target{

    @Override
    public String supply() {
        return doSupply();
    }
}
