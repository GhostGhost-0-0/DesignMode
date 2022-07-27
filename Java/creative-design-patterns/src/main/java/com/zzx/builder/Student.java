package com.zzx.builder;

import java.util.List;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.bulider
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-27 15:09
 * @Description: 学生类
 * @Version: 1.0
 */
public class Student {
    private int id;
    private int age;
    private int grade;
    private String name;
    private String college;
    private String profession;
    private List<String> awards;

    public Student(int id, int age, int grade, String name, String college, String profession, List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public List<String> getAwards() {
        return awards;
    }

    public void setAwards(List<String> awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", profession='" + profession + '\'' +
                ", awards=" + awards +
                '}';
    }
}
