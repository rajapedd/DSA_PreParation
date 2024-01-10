package com.raja.BinaryTree.problem10;

public class EvaluateExpressionTree {
    static int expValue;

    public static void main(String[] args) {
        EvaluateExpressionTree.BinaryTree tree = new EvaluateExpressionTree.BinaryTree(-1);
        tree.left = new EvaluateExpressionTree.BinaryTree(2);
        tree.right = new EvaluateExpressionTree.BinaryTree(-2);
        tree.right.left = new EvaluateExpressionTree.BinaryTree(5);
        tree.right.right = new EvaluateExpressionTree.BinaryTree(1);
        var expected = 6;
        var actual = new EvaluateExpressionTree().evaluateExpressionTree(tree);
        System.out.println("Total Expressions Value :: " + actual);
    }


    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

//    public int evaluateExpressionTree(BinaryTree tree) {
//        expValue = 0;
//        evaluateExpression(tree, 0);
//        return expValue;
//    }

    public int evaluateExpressionTree(BinaryTree tree) {
        expValue=0;
        if (tree.value >= 0) {
            return tree.value;
        }
        int leftValue=evaluateExpressionTree(tree.left);
        int rightValue=evaluateExpressionTree(tree.right);
        System.out.println("Tree Value :: " + tree.value);
        System.out.println("Tree Value :: " + tree.value);
        int expression=tree.value;
        if (expression == -1) {
            expValue = leftValue + rightValue;
        }
        if (expression == -2) {
            expValue = leftValue - rightValue;
        }
        if (expression == -3) {
            expValue = leftValue / rightValue;
        }
        if (expression == -4) {
            expValue = leftValue * rightValue;
        }
    return expValue;
    }
}
