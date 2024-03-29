package com.raja.BinaryTree.problem8;

import java.util.ArrayList;
import java.util.List;

public class TestBinaryTree extends BranchSum.BinaryTree {
    TestBinaryTree(int value) {
        super(value);
    }

    TestBinaryTree insert(List<Integer> values) {
        return insert(values, 0);
    }

    TestBinaryTree insert(List<Integer> values, int i) {
        if (i >= values.size()) return null;

        List<TestBinaryTree> queue = new ArrayList<TestBinaryTree>();
        queue.add(this);
        while (queue.size() > 0) {
            TestBinaryTree current = queue.get(0);
            queue.remove(0);
            if (current.left == null) {
                current.left = new TestBinaryTree(values.get(i));
                break;
            }
            queue.add((TestBinaryTree) current.left);
            if (current.right == null) {
                current.right = new TestBinaryTree(values.get(i));
                break;
            }
            queue.add((TestBinaryTree) current.right);
        }
        insert(values, i + 1);
        return this;
    }
}