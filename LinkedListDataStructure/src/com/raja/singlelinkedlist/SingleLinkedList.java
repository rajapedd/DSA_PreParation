package com.raja.singlelinkedlist;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	
	public Node createSingleLinkedList(int newData) {
		head = new Node();
		
		Node newNode=new Node();
		newNode.newValue=newData;
		
		newNode.next=head.next;
		head=newNode;
		tail=newNode;
		size=1;
		
		return head;
	}
	
	
	
	public void insertAfter(Node prevNode,int newData) {
		
		if(prevNode==null) {
			System.out.println("The Given Previous Node Cannot Be Null...");
			return ;
		}
		
		Node newNode=new Node();
		newNode.newValue=newData;
		newNode.next=prevNode.next;
		prevNode.next=newNode;
		
	}
	
	
	public void atStart(int newData) {
		Node newNode=new Node();
		newNode.newValue=newData;
		newNode.next=head.next;
		head=newNode;
		tail=newNode;
		
	}
	
	
	public void atEnd(int newData) {
		Node newNode=new Node();
		newNode.newValue=newData;
		newNode.next=null;
		
		if(head==null) {
			head=new Node();
			head.newValue=newData;
			return ;
			
		}
		
		
		Node last=head;
		while(last.next != null) {
			last=last.next;
			
		}
		last.next=newNode;
		return;
		
	}

	
	
	
	public void printLinkedList() {
		Node tNode=head;
		while(tNode !=null) {
			System.out.print(tNode.newValue+" ");
			tNode=tNode.next;
		}
		
	}
}
