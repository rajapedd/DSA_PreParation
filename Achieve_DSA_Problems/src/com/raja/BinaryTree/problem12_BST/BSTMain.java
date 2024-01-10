package com.raja.BinaryTree.problem12_BST;

public class BSTMain {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }


        public BST insert(int value) {
            insertHelper(this, value);
            return this;
        }


        public BST insertHelper(BST node, int value) {
            if(node==null){
                return new BST(value);
            }
            if(value < node.value){
                node.left=insertHelper(node.left,value);
            }else{
                node.right=insertHelper(node.right,value);
            }
            return node;
        }

        public boolean contains(int value) {
            return searchFor(this,value);
            // if(null != node && node.value==value){
            //     return true;
            // }
            //return bool;
        }

        public boolean searchFor(BST tree, int value){
            if(tree==null){
                return false;
            }
            if(tree.value==value){
                return true;
            }else if(value < tree.value){
                return searchFor(tree.left,value);
            }else {
                return searchFor(tree.right,value);
            }
        }

        public BST remove(int value) {
            helperToRemove(this,value);
            return this;
        }


        private BST helperToRemove(BST bst, int value) {
            if(bst==null){
                return null;
            }
            if(value < bst.value){
                bst.left=helperToRemove(bst.left,value);
            }else if(value > bst.value){
                bst.right=helperToRemove(bst.right,value);
            }else{
                if(bst.right == null && bst.left == null){
                    return null;
                }
                if(bst.right != null && bst.left == null){
                    bst.value = bst.right.value;
                    bst.right = bst.right.right;
                    bst.left = bst.right.left;
                    return bst;
                }

                if(bst.right == null && bst.left != null){
                    bst.value = bst.left.value;
                    bst.right = bst.left.right;
                    bst.left = bst.left.left;
                    return bst;
                }

                    if(bst.right != null && bst.left != null){
                        BST rightminNode=successorNode(bst.right);
                        System.out.println("rightminNode:: "+rightminNode.value);
                        bst.value=rightminNode.value;
                        bst.right=helperToRemove(bst.right,rightminNode.value);
                        return bst;
                    }
            }
            return bst;
        }




        private BST successorNode(BST right) {
            if(right.left==null){
                return right;
            }else{
                return  successorNode(right.left);
            }
        }


    }
}
