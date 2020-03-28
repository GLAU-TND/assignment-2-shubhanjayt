/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {

        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insert(85);
        bst.insert(25);
        bst.insert(45);
        bst.insert(15);
        bst.insert(17);
        bst.insert(15);
        bst.insert(10);
    }
}
