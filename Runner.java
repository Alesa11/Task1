package com.company;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        List list = new ArrayList();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        list = linkedList.print();
        System.out.println(list);
        linkedList.delete();
        list = linkedList.print();
        System.out.println(list);
        System.out.println(linkedList.get(15));
    }
}
