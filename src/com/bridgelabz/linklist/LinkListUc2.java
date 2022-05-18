package com.bridgelabz.linklist;

public class LinkListUc2 {
    /*
    Use Case 2
    */
    // declaring type of head
    public Node head;


    // create node class
    class Node {
        int data;
        Node next;

        //constructor for Node Class
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //function to add element
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;

        }
    }

    //printing element of linked list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkListUc2 list = new LinkListUc2();
        list.addFirst(70); // add 70 and create head at 70
        list.printList();
        list.addFirst(30); //add 30 and move head at 30
        list.printList();
        list.addFirst(56);// add 56 and move head at 56
        list.printList();

    }
}

