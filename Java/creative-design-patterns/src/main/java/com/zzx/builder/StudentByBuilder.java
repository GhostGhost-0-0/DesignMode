package com.zzx.builder;

import java.util.List;

/**
 * @BelongProject: Java
 * @BelongPackage: com.zzx.builder
 * @Author: 那个小楠瓜
 * @CreateTime: 2022-07-27 15:17
 * @Description: 使用建造者模式的学生类
 * @Version: 1.0
 */
public class StudentByBuilder {

    private int id;
    private int age;
    private int grade;
    private String name;
    private String college;
    private String profession;
    private List<String> awards;

    /**
     * 一律使用建造者来创建，不对外直接开放
     * @param id 学生id
     * @param age 学生年龄
     * @param grade 学生成绩
     * @param name 学生名字
     * @param college 学生的学院
     * @param profession 学生的专业
     * @param awards 学生的奖项
     */
    private StudentByBuilder(int id, int age, int grade, String name, String college, String profession, List<String> awards) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.college = college;
        this.profession = profession;
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "StudentByBuilder{" +
                "id=" + id +
                ", age=" + age +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                ", college='" + college + '\'' +
                ", profession='" + profession + '\'' +
                ", awards=" + awards +
                '}';
    }

    /**
     * 通过builder方法直接获取建造者
     * @return StudentBuilder
     */
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public static class StudentBuilder {
        // Builder 也需要将所有的参数都进行暂时保存，所以 Student 怎么定义的这里就怎么定义
        private int id;
        private int age;
        private int grade;
        private String name;
        private String college;
        private String profession;
        private List<String> awards;

        /**
         * 直接调用建造者对应的方法，为对应的属性赋值
         * @param id 学生的 id
         * @return StudentBuilder
         */
        public StudentBuilder id(int id) {
            this.id = id;
            return this;    // 为了支持链式调用，这里直接返回建造者本身，下同
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder grade(int grade) {
            this.grade = grade;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder college(String college) {
            this.college = college;
            return this;
        }

        public StudentBuilder profession(String profession) {
            this.profession = profession;
            return this;
        }

        public StudentBuilder awards(List<String> awards) {
            this.awards = awards;
            return this;
        }

        /**
         * 最后我们只需要调用建造者提供的 build 方法即可根据我们的配置返回一个对象
         * @return StudentByBuilder
         */
        public StudentByBuilder build() {
            return new StudentByBuilder(id, age, grade, name, college, profession, awards);
        }
    }
}
