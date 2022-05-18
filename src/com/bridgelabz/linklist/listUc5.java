package com.bridgelabz.linklist;

public class listUc5 extends LinkListUc8 {
    //Use case 5 deleting first node
    public static void pop() {
        Node currentNode = head.next;
        head.next = null;
        head = currentNode;
    }
    public static void main(String[] args) {
        addToList(56);
        addToList(70);
        insertInBetween(56, 30);
        System.out.println("List Before deleting");
        printList();
        pop();
        System.out.println("List after deleting");
        printList();
    }
}