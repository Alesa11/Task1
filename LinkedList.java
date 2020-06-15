package com.company;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private int size = 0;
    private Node head;

    public LinkedList() {
        head = null;
    }

    private boolean isEmpty() {
        return head == null;
    }

    public void add(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
        size++;
    }

    public int size() {
        return size;
    }

    public void delete() {
        head = head.next;
    }

    public boolean delete(int key) {
        Node cur = head;
        Node prev = head;
        while (cur.data != key) {
            if (isEmpty()) {
                return false;
            } else {
                prev = cur;
                cur = cur.next;
            }
            if (cur == head)
                head = head.next;
            else
                prev.next = cur.next;
        }
        return true;
    }

    public int get(int key) {
        Node temp = head;
        int number = 0;
        while (temp != null) {
            if (temp.data == key)
                return number;
            temp = temp.next;
            number++;
        }
        return -1;
    }

    public List print() {
        List list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        return list;
    }
}


