package com.raja.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(2);
        ll.insertNode(4);
        ll.traverseLL();
        RemoveDuplicates rd=new RemoveDuplicates();
        rd.deleteDuplicates(ll);
        ll.traverseLL();
        NthToLast nl=new NthToLast();
        Node n=nl.nthToLast(ll,3);
    System.out.println("Nth Node to Last Val::"+n.value);
    }
}
