package com.zzx.builder;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.builder
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-27 15:11
 * @Description: 建造者模式测试
 * @Version: 1.0
 */
public class BuilderTest {

    /**
     * 正常地创建对象模式
     */
    @Test
    public void test() {
        Student student = new Student(1, 18, 3, "小明", "计算机学院", "计算机科学与技术", Arrays.asList("ICPC-ACM 区域赛 金牌", "LPL 2022春季赛 冠军"));
        System.out.println(student.toString());
    }

    /**
     * 使用建造者模式创建对象
     */
    @Test
    public void builderTest() {
        StudentByBuilder student = StudentByBuilder.builder()
                .id(1)
                .age(18)
                .grade(3)
                .name("小明")
                .college("计算机学院")
                .profession("计算机科学与技术")
                .awards(Arrays.asList("ICPC-ACM 区域赛 金牌", "LPL 2022春季赛 冠军"))
                .build();
        System.out.println(student.toString());
    }
}
