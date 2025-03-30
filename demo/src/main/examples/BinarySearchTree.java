package main.exmaples;

/** 
 * 
 */
public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    // Root instance variable.
    private Node root;

    private class Node {
        private Key key;
        private Value val;
        private Node left;
        private Node right;
        private int N;

        /**
         * Nested Node class for BST.
         * 
         * @param key
         * @param val
         * @param N
         */
        public Node(Key key, Value val, int N) {
            this.key = key;
            this.val = val;
            this.N = N;
        } // Constructor
    } // Nested Node Class

    // public size method which calls private size method and passes root node.
    public int size() { 
        return size(root);
    } // size

    // private size method which does size operation
    private int size(Node x) { 
        if (x == null) return 0;
        else return x.N;
    } // size

    /**
     * 
     * @param key
     * @return
     */
    public Value get(Key key) { 
        return get(root, key);
    } // get

    /**
     * 
     * @param x
     * @param key
     * @return
     */
    private Value get (Node x, Key key) { 
        if (x == null) return null;
        int cmp = key.compareTo(x.key);
        if (cmp < 0) return get(x.left, key);
        else if (cmp > 0) return get(x.right, key);
        else return x.val;
    } // get

    /**
     * 
     * @param key
     * @param val
     */
    public void Insert(Key key, Value val) { 
        root = Insert(root, key, val);
    } // Insert

    /**
     * 
     * @param x
     * @param key
     * @param val
     * @return
     */
    private Node Insert (Node x, Key key, Value val) { 
        if (x == null) return new Node (key, val, 1);
        int cmp = key.compareTo(x.key);
        if (cmp < 0) x.left = Insert(x.left, key, val);
        else if (cmp > 0) x.right = Insert(x.right, key, val);
        else x.val = val;
        x.N = size(x.left) + size(x.right) + 1;
        return x;
    } // Insert
 
    public static void main(String[] args) {
        System.out.println("Working...");
    } // main

} // BinaryTree
