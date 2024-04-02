package com.gss.algorithms.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    static Node head;
    static Node tail;

    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print("--> " + current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {

        addNode(1);
        addNode(2);
        addNode(3);
        printList();
        System.out.println("\nLength of the list: " + length());
    }
}
