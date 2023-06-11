package com.raja.linkedlist;

public class NthToLast {
    public Node nthToLast(LinkedList ll, int n){
        Node p1=ll.head;
        Node p2=ll.head;

        for(int i=0;i<n;i++){
            if(p2==null){
                return null;
            }

            p2=p2.next;
            //System.out.println("p2 values at loop 1::"+p2);
           // System.out.println("p1 values at loop 1::"+p1.value);
        }

        while(p2 !=null){
            p1=p1.next;
            p2=p2.next;

          // System.out.println("p2 values at loop 2::"+p2.value);
           System.out.println("p1 values at loop 2::"+p1.value);
        }
           //System.out.println("Final Val::"+p1.value);
            return p1;
    }
}
