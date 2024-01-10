package com.raja.BinaryTree.problem12_BST;

public class BSTTest {
    public static void main(String[] args) {
        var root = new BSTMain.BST(1);
//        var root = new BSTMain.BST(10);
//        root.left = new BSTMain.BST(5);
//        root.left.left = new BSTMain.BST(2);
//        root.left.left.left = new BSTMain.BST(1);
//        root.left.right = new BSTMain.BST(5);
//        root.right = new BSTMain.BST(15);
//        root.right.left = new BSTMain.BST(13);
//        root.right.left.right = new BSTMain.BST(14);
//        root.right.right = new BSTMain.BST(22);
        System.out.println("===================================");
        root.insert(2);
        root.insert(3);
        root.insert(4);
        root.insert(5);
        root.insert(6);
        root.insert(7);
        root.insert(8);
        root.insert(9);
        root.insert(10);
        root.insert(11);
        root.insert(12);
        root.insert(13);
        root.insert(14);
        root.insert(15);
        root.insert(16);
        root.insert(17);
        root.insert(18);
        root.insert(19);
        root.insert(20);
        TreePrinter(root);
        System.out.println("===================================");
        root.remove(2);
        root.remove(4);
        root.remove(6);
        root.remove(8);
        root.remove(11);
        root.remove(13);
        root.remove(15);
        root.remove(17);
        root.remove(19);
        TreePrinter(root);
        System.out.println("===================================");
        root.insert(1);
        root.insert(2);
        root.insert(3);
        root.insert(4);
        root.insert(5);
        root.insert(6);
        root.insert(7);
        root.insert(8);
        root.insert(9);
        root.insert(10);
        TreePrinter(root);
        System.out.println("===================================");
        //boolean bool=root.contains(9000);
      //  System.out.println("Element Contains:: "+bool);


    }


    public static void TreePrinter(BSTMain.BST tree) {
        int h = height(tree);
        int col = getcol(h);
        int[][] M = new int[h][col];
        printTree(M, tree, col / 2, 0, h);
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < col; j++) {
                if (M[i][j] == 0)
                    System.out.print("  ");
                else
                    System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printTree(int[][] M, BSTMain.BST root, int col, int row, int height) {
        if (root == null)
            return;
        M[row][col] = root.value;
        printTree(M, root.left, col - (int)Math.pow(2, height - 2), row + 1, height - 1);
        printTree(M, root.right, col + (int)Math.pow(2, height - 2), row + 1, height - 1);
    }


    public static int height(BSTMain.BST root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    public static int getcol(int h) {
        if (h == 1)
            return 1;
        return getcol(h - 1) + getcol(h - 1) + 1;
    }
}
