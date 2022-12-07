package com.veraTarasova;

import java.util.ArrayList;
import java.util.List;

public class CreateObject {
    public List<Child> myChildren = new ArrayList<>();
//    Child barbara = new Girl("Варя", 13);
//    Child john = new Boy("Ваня", 10);
//    Child anna = new Girl("Аня", 7);
//    Child xenia = new Girl("Ксюша", 4);

    public static List<Child> addChildren (List<Child> myChildren) {
        Child barbara = new Girl("Варя", 13);
        Child john = new Boy("Ваня", 10);
        Child anna = new Girl("Аня", 7);
        Child xenia = new Girl("Ксюша", 4);
        myChildren.add(barbara);
        myChildren.add(john);
        myChildren.add(anna);
        myChildren.add(xenia);
        return myChildren;
    }

    public static void helloChildren (List<Child> myChildren) {
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

