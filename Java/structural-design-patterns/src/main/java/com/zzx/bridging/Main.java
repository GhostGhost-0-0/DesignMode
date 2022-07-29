package com.zzx.bridging;

import com.zzx.bridging.size.Mini;
import com.zzx.bridging.tea.LargeKissTea;
import com.zzx.bridging.tea.MiniKissTea;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.bridging
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-29 16:03
 * @Description: 桥接模式测试
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        LargeKissTea largeKissTea = new LargeKissTea();
        System.out.println(largeKissTea.getSize()+largeKissTea.getType());
        MiniKissTea miniKissTea = new MiniKissTea(new Mini());
        System.out.println(miniKissTea.getSize()+miniKissTea.getType());
    }
}
