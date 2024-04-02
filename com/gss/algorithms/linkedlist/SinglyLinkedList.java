package com.gss.algorithms.linkedlist;

/**
 * Class representing a node in a singly linked list.
 */
class Node {
    int data;  // The data stored in the node.
    Node next;  // The next node in the list.

    /**
     * Constructor for a Node.
     *
     * @param data The data to be stored in the node.
     */
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

/**
 * Class representing a singly linked list.
 */
public class SinglyLinkedList {
    static Node head;  // The first node in the list.
    static Node tail;  // The last node in the list.

    /**
     * Adds a node to the end of the list.
     *
     * @param data The data to be stored in the new node.
     */
    public static void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * Returns the length of the list.
     *
     * @return The number of nodes in the list.
     */
    public static int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    /**
     * Prints the data in the list to the console.
     */
    public static void printList() {
        Node current = head;
        while (current != null) {
            System.out.print("--> " + current.data);
            current = current.next;
        }
    }

    /**
     * Main method for testing the SinglyLinkedList class.
     *
     * @param args Command-line arguments. Not used.
     */
    public static void main(String[] args) {

        addNode(1);
        addNode(2);
        addNode(3);
        //TODO - Add more nodes to the list
        printList();

        System.out.println("\nLength of the list: " + length());


        int a = 4;

        if (a > 3) {
            System.out.println("a is greater than 3");
        } else {
            System.out.println("a is less than or equal to 3");
        }

        if (a == 2) {
            System.out.println("a is equal to 2");
        } else {
            System.out.println("a is not equal to 2");
        }
    }
}