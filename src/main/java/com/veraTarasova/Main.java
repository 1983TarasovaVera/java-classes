package com.veraTarasova;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Child> myChildren = new ArrayList<>();
        CreateObject.addChildren(myChildren);
        System.out.println("Привет! Я - " + Child.mother + ". Познакомьтесь с моими детьми)");
        System.out.println();
        CreateObject.helloChildren(myChildren);
    }
}
