package com.raja.linkedlist;
import java.util.HashSet;
public class RemoveDuplicates {

    public void deleteDuplicates(LinkedList ll){
        HashSet<Integer> hs=new HashSet<>();
        Node currentNode=ll.head;
        Node prevNode=null;
        while(currentNode != null){
            int curValue= currentNode.value;
            if(hs.contains(curValue)){
                prevNode.next=currentNode.next;
                ll.size--;
            }else{
                hs.add(curValue);
                prevNode=currentNode;
            }
            currentNode=currentNode.next;

        }

    }
}
