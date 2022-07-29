package com.zzx.bridging.tea;

import com.zzx.bridging.size.Size;
import com.zzx.bridging.tea.Tea;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.bridging
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 15:54
 * @Description: 大杯芋圆啵啵奶茶
 * @Version: 1.0
 */
public class LargeKissTea implements Tea, Size {
    @Override
    public String getSize() {
        return "大杯";
    }

    @Override
    public String getType() {
        return "芋圆啵啵奶茶";
    }
}
