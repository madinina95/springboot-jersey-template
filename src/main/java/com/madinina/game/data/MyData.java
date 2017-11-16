package com.madinina.game.data;

import org.springframework.stereotype.Component;

@Component
public class MyData {

    private String name = "yohan";
    private int age = 31;

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
}
