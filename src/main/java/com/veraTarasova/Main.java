package com.veraTarasova;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Child> myChildren = new ArrayList<>();
        Child barbara = new Girl("Варя", 13);
        Child john = new Boy("Ваня", 10);
        Child anna = new Girl("Аня", 7);
        Child xenia = new Girl("Ксюша", 4);
        myChildren.add(barbara);
        myChildren.add(john);
        myChildren.add(anna);
        myChildren.add(xenia);

        System.out.println("Привет! Я - " + Child.mother + ". Познакомьтесь с моими детьми)");
        System.out.println();

        for (Child child : myChildren) {
            child.meetChild();
            child.joyGender();
            if (child.isSchoolchild()) {
                System.out.println("Терпеть не могу школу...");
            } else {
                System.out.println("Скорей бы в школу...");
            }
            System.out.println();
        }
    }
}
