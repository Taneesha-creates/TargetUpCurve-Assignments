package com.example.javachallenge;

// Write a java program to print all the leaf nodes of the binary tree

public class Ques17 {

    static class Node{
        public char value;
        public Node left, right;
    };

    public static void printLeaf(Node root)
    {
        if (root == null)
            return;
        if (root.left == null && root.right == null){
            System.out.println(root.value);
            return;
        }
        if(root.left != null){
            printLeaf(root.left);
        }
        if (root.right != null){
            printLeaf(root.right);
        }
    }

    public static Node createNode(char val){
        Node temp = new Node();
        temp.value = val;
        temp.left = null;
        temp.right = null;
        return temp;
    }
    public static void main(String[] args) {
        Node root = createNode('A');
        root.left = createNode('B');
        root.right = createNode('F');
        root.left.left = createNode('C');
        root.left.right = createNode('E');
        root.left.left.left = createNode('D');
        root.right.right = createNode('H');
        root.right.left = createNode('G');
        root.right.right.right = createNode('K');

        System.out.println("The leaf nodes for given binary tree are: ");
        printLeaf(root);
    }
}
