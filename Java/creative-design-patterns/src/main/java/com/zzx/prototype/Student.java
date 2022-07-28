package com.zzx.prototype;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.prototype
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-28 14:31
 * @Description: 学生类
 * @Version: 1.0
 */
public class Student implements Cloneable{
    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
