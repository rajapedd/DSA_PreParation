package com.raja.BST;

// This file is initialized with a code version of this
// question's sample test case. Feel free to add, edit,
// or remove test cases in this file as you see fit!

import org.junit.*;

class ProgramTest {

    public static void main(String[] args) {
        var root = new FindClosestValueInBST.BST(10);
        root.left = new FindClosestValueInBST.BST(5);
        root.left.left = new FindClosestValueInBST.BST(2);
        root.left.left.left = new FindClosestValueInBST.BST(1);
        root.left.right = new FindClosestValueInBST.BST(5);
        root.right = new FindClosestValueInBST.BST(15);
        root.right.left = new FindClosestValueInBST.BST(13);
        root.right.left.right = new FindClosestValueInBST.BST(14);
        root.right.right = new FindClosestValueInBST.BST(22);

        var expected = 13;
        var actual = FindClosestValueInBST.findClosestValueInBst(root, 12);
        System.out.println("Test Out  Value:: "+actual);

      //Utils.assertEquals(expected, actual);
   }
}
