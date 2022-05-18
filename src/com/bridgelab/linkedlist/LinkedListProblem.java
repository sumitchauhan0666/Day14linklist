package com.bridgelab.linkedlist;

import com.bridgelab.hashtable.INode;
import com.bridgelab.hashtable.MyLinkedList;

public class LinkedListProblem {
    public static void main(String[] args) {

        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myFourthNode = new MyNode<>(40);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add((INode) myFirstNode);
        myLinkedList.append((INode) myThirdNode);
        myLinkedList.insert((INode) myFirstNode, (INode) mySecondNode);
        myLinkedList.search(mySecondNode);
        myLinkedList.insertUsingKey((INode) mySecondNode, (INode) myFourthNode);
        myLinkedList.deleteKey(myFourthNode);
        myLinkedList.printMyNodes();
        myLinkedList.size();


    }

}