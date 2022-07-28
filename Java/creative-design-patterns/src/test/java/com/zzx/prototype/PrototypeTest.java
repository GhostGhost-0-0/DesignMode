package com.zzx.prototype;

import org.junit.jupiter.api.Test;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.prototype
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-28 14:34
 * @Description: 原型模式测试
 * @Version: 1.0
 */
public class PrototypeTest {

    @Test
    public void prototypeTest() throws CloneNotSupportedException {
        Student stu = new Student("小明");
        Student clone = (Student) stu.clone();
        System.out.println();
        System.out.println(stu);
        System.out.println(clone);
        System.out.println(stu.getName());
        System.out.println(clone.getName());
        System.out.println();
    }
}
