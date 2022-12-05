package com.veraTarasova;

public abstract class Child {

    static String mother = "Вера";

    String name;
    int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void meetChild () {
        System.out.println("Привет! Меня зовут " + name + "! Мне " + age + " лет.");
    }

    public boolean isSchoolchild () {
        return age >= 7;
    }

    public abstract void joyGender();
}
