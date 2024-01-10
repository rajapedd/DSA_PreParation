package com.raja.BinaryTree.problem8;

import java.util.*;

class BranchSumProgramTest {


//    @Test
//    public void TestCase1() {
//        TestBinaryTree tree =
//                new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
//        List<Integer> expected =
//                new ArrayList<Integer>(Arrays.asList(15, 16, 18, 10, 11));
//        Utils.assertTrue(Program.branchSums(tree).equals(expected));
//    }

    public static void main(String[] args) {
        TestBinaryTree tree =
                new TestBinaryTree(1).insert(Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> expected =
                new ArrayList<Integer>(Arrays.asList(15, 16, 18, 10, 11));
        System.out.println(BranchSum.branchSums(tree).equals(expected));
    }
}
