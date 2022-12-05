package com.veraTarasova;

public class Girl extends Child {
    static String gender = "Female";

    public Girl(String name, int age) {
        super(name, age);
    }

    @Override
    public void joyGender() {
        System.out.println("Девчонки рулят!");
    }
}
