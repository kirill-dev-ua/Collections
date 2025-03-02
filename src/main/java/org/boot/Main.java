package org.boot;

import org.boot.collections.MyArrayList;

public class Main {
    public static void main(String[] args) {

        MyArrayList<String> myArrayList = new MyArrayList<>();
        myArrayList.add("Hello");
        myArrayList.add("World");
        myArrayList.add("Java");
        myArrayList.add("Python");
        myArrayList.add("C++");
        myArrayList.add("JavaScript");
        myArrayList.add("Python");
        System.out.println(myArrayList);

        myArrayList.lastIndexOf("Python1");
        System.out.println(myArrayList.lastIndexOf("Python1"));
    }
}