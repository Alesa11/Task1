package com.company;

import org.w3c.dom.ls.LSOutput;

public class Runner {

    public static void main(String[] args) {
        List list = new List();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.print();

        System.out.println();
        list.delete();
        list.print();
        System.out.println(list.get(15));
    }
}
