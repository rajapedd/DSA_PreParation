package com.raja.BST;

import java.util.*;
public class FindClosestValueInBST {

    public static int findClosestValueInBst(BST tree, int target) {
        // Write your code here.

        BST presentNode=null;
        int closeDiff=Integer.MAX_VALUE;
        int closeValue=tree.value;
        while(tree !=null){
            int value= tree.value-target;
            if(closeDiff > Math.abs(value)){
                closeDiff=Math.abs(value);
                closeValue=tree.value;
            }

            if(tree.value==target){
                return target;
            }

            if(tree.value < target){
                tree=tree.right;
            }else{
                tree=tree.left;
            }

        }
        return closeValue;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
