package com.raja.singlelinkedlist;

public class UdemyMain2 {

	public static void main(String[] args) {
		SingleLinkedList2 sll2 = new SingleLinkedList2();
		sll2.insertLinkedList(1, 0);
		
		sll2.insertLinkedList(2, 1);
		sll2.insertLinkedList(3, 2);
		sll2.insertLinkedList(4, 3);
		
		sll2.insertLinkedList(20, 30);
		sll2.printLinkedList();
		System.out.print("Size of Linked List::" + sll2.size);
	}

}
