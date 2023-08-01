package com.raja.BinaryTree;

import java.util.*;

public class BranchSum {
    // This is the class of the input root. Do not edit it.
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

//    public static List<Integer> branchSums(BinaryTree root) {
//        // Write your code here.
//        System.out.println("Test");
//        System.out.println(root.value);
//        if(root==null){
//            return new ArrayList<Integer>();
//        }
//        List<Integer> sumList= new ArrayList<Integer>();
//        int value=root.value;
//        int rightValue=root.value;
//
//        while(root !=null){
//            value+=root.value;
//            System.out.println(" Val:: "+value);
//            if(root.left !=null){
//                root=root.left;
//            }
//
//            if(root.right !=null){
//                root=root.right;
//            }
//            sumList.add(value);
//            if(root.left==null && root.right==null){
//                break;
//            }
//        }
//
//        System.out.println(sumList.toString());
//
//        return sumList;
//    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> result= new ArrayList<Integer>();
        sumClass(root,0,result);
        System.out.println(result.toString());
        return result;
    }

    private static void sumClass(BinaryTree root, int sum, List<Integer> result) {

        if(root==null){
            return;
        }
        System.out.println("Print node value sequence :: "+root.value);
        if(root.left ==null && root.right==null){
            System.out.println("Print Sum Value:: "+(sum+root.value));
            result.add(sum+root.value);
            return;
        }

        sumClass(root.left,sum+ root.value,result);
        sumClass(root.right,sum+ root.value,result);


    }
}

