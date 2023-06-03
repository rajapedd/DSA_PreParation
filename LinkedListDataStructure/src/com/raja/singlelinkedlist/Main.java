package com.raja.singlelinkedlist;

public class Main {

	public static void main(String[] args) {
		SingleLinkedList sLL=new SingleLinkedList();
		sLL.createSingleLinkedList(10); // Create a new node at the starting of the Linked List.
		//System.out.println("Size of SLL::"+sLL.head.newValue);
		sLL.atStart(10);
		//sLL.insertAfter(Node nodeNew, 8);
		sLL.atEnd(30);
		sLL.atEnd(40);
		sLL.atStart(10);
		sLL.atEnd(50);
		sLL.atStart(5);
		sLL.insertAfter(sLL.head.next, 6);
		sLL.printLinkedList();
		

	}

}
