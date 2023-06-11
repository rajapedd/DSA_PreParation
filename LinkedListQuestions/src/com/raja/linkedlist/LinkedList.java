package com.raja.linkedlist;

public class LinkedList {
    public Node head;
    public Node tail;

    public int size;

    public void createLL(int nodeValue) {
        Node tempNode=new Node();
        tempNode.value=nodeValue;
        tempNode.next=null;
        head=tempNode;
        tail=tempNode;
        size=1;
    }


    public void insertNode(int nodeValue){
        Node tempNode= new Node();
        tempNode.value=nodeValue;
        tempNode.next=null;
        tail.next=tempNode;
        tail=tempNode;
        size++;
    }

    public void traverseLL() {
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            System.out.print(tempNode.value);
            if (i != size - 1) {
                System.out.print(" -- >");
            }

            tempNode = tempNode.next;
        }

System.out.println("\n");


    }



}
