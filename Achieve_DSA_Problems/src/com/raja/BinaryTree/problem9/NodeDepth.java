package com.raja.BinaryTree.problem9;

import java.util.ArrayList;
import java.util.List;

public class NodeDepth {
    static int  totalDepth=0;
    public static void main(String[] args) {
        var root = new NodeDepth.BinaryTree(1);
        root.left = new NodeDepth.BinaryTree(2);
        root.left.left = new NodeDepth.BinaryTree(4);
        root.left.left.left = new NodeDepth.BinaryTree(8);
        root.left.left.right = new NodeDepth.BinaryTree(9);
        root.left.right = new NodeDepth.BinaryTree(5);
        root.right = new NodeDepth.BinaryTree(3);
        root.right.left = new NodeDepth.BinaryTree(6);
        root.right.right = new NodeDepth.BinaryTree(7);
        int actual = NodeDepth.nodeDepths(root);
        System.out.println("value:: "+actual);
    }

    public static int nodeDepths(BinaryTree root) {

        nodeDepthsValue(root,0);
        System.out.println("totalDepth :: "+totalDepth);
        return totalDepth;
    }

    public static void   nodeDepthsValue(BinaryTree root,int level) {
        if(root==null){
            return;
        }
       totalDepth += level;
        System.out.println("Root Val::"+root.value);
        System.out.println("totalDepth:"+totalDepth);
        if(root.left==null && root.right==null){
            //totalDepth+=1;
            return;
        }

        nodeDepthsValue(root.left,level+1);
        nodeDepthsValue(root.right,level+1);

    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }



}
