package com.bridgelab.queue;

public class MyQueueMain {

    public static void main(String[] args) {


        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQueue myQueue = new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.size();
        myQueue.isEmpty();
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printQueue();
    }
}