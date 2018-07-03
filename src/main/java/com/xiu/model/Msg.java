package com.xiu.model;

import java.io.Serializable;

/**
 * @Auther 创建者: Tc李
 * @Date 创建时间: 2018/07/02 21:15
 * @Description 类描述:
 */
public class Msg implements Serializable {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
