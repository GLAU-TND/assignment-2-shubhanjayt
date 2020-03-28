package problem4.binaryST;

import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;

public class MyBinarySearchTree {

    private MyQueue myQueue;
    private TreeNode root;


    public MyBinarySearchTree(MyQueue queue) {
        this.myQueue = queue;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);
        if (root == null) {
            root = node;
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (current != null) {
                parent = current;
                if (node.getData() < current.getData()) {
                    current = current.getLeft();
                } else {
                    current = current.getRight();
                }
            }
            if (node.getData() < parent.getData()) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
        }
    }
}
