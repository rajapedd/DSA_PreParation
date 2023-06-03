package com.raja.singlelinkedlist;

public class SingleLinkedList2 {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSingleLinkedList(int newValue) {
		head= new Node();
		Node newNode=new Node();
		newNode.newValue=newValue;
		newNode.next=null;
		head=newNode;
		tail=newNode;
		return head;
	}
	
	//Insert Algorithm as per the Udemy Class
	
	public void insertLinkedList(int newValue,int location) {
		
	Node node=new Node();
	node.newValue=newValue;
	
	if(head==null) {
		createSingleLinkedList(newValue);
		return;
		
	}else if(location==0) { // Means at Starting
		node.next=head;
		head=node;
		
	}else if(location >=size-1) { // It mean at the end
		node.next=null;
		Node last=head;
		
		
		while(last.next!=null) {
			last=last.next;
		}
		
		last.next=node;
		
	}else { // After a node or specified location
		Node tempNode=head;
	int index=0;
	while(index <location-1) {
		tempNode=tempNode.next;
		index++;
	}
	Node nextNode=tempNode.next;
	tempNode.next=node;
	node.next=nextNode;
	}
	size++;

	}

	public void printLinkedList() {
		Node tNode=head;
		while(tNode !=null) {
			System.out.print(tNode.newValue+" ");
			tNode=tNode.next;
		}
		
	}
	
}
