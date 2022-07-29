package com.zzx.bridging.tea;

import com.zzx.bridging.size.Size;
import com.zzx.bridging.tea.RefinedAbstractTea;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.bridging
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:06
 * @Description: TODO
 * @Version: 1.0
 */
public class MiniKissTea extends RefinedAbstractTea {

    /**
     * 在构造时需要知道尺寸属性
     *
     * @param size 尺寸
     */
    public MiniKissTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return "芋圆啵啵奶茶";
    }
}
