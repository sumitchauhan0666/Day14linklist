package com.bridgelabz.linklist;

public class LinkListUc3 extends LinkListUc2 {

    //Use Case 3
    public void addLast(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public static void main(String[] args) {
        LinkListUc3  l2 = new LinkListUc3();
        l2.addFirst(56);
        l2.printList();
        l2.addLast(30);
        l2.printList();
        l2.addLast(70);
        l2.printList();
    }
}