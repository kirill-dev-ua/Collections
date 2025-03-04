package org.boot;

import org.boot.collections.MyArrayList;
import org.boot.collections.MyLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        System.out.println(list.indexOf("c"));
    }
}


































