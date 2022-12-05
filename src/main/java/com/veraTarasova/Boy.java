package com.veraTarasova;

public class Boy extends Child {
    static String gender = "Male";

    public Boy(String name, int age) {
        super(name, age);
    }

    @Override
    public void joyGender() {
        System.out.println("Быть мальчишкой круто!");
    }
}
