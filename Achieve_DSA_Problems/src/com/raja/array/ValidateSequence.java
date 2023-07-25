package com.raja.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidateSequence {
    public static void main(String[] args) {
//        ArrayList<Integer> array= new ArrayList<>();
//        array.add(5);
//        array.add(1);
//        array.add(22);
//        array.add(25);
//        array.add(6);
//        array.add(-1);
//        array.add(8);
//        array.add(10);
//        ArrayList<Integer> sequence= new ArrayList<>();
//        sequence.add(1);
//        sequence.add(6);
//        sequence.add(-1);
//        sequence.add(10);

        List<Integer> array= Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence= Arrays.asList(22, 25, 6);


//        "array": [5, 1, 22, 25, 6, -1, 8, 10],
//        "sequence": [1, 6, -1, 5]
      //  "array": [5, 1, 22, 25, 6, -1, 8, 10],
       // "sequence": [22, 25, 6]
       boolean Val= isValidSubsequence(array,sequence);
        System.out.println("Return Val:: "+Val);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
      //  Stack<Integer> s=new Stack<>();
        int counter=0;
        for(int i=0;i<array.size();i++){
         if(sequence.get(counter)==(array.get(i))){
             System.out.println("Array Value Existing in Sequence:: "+array.get(i));
             counter++;
         }
            if(counter==sequence.size()){
                break;
            }
        }
        System.out.println("Counter :: "+counter);
        System.out.println("sequence Size :: "+sequence.size());
        if(counter==sequence.size()){
          return true;
        }

        return false;
    }
}
