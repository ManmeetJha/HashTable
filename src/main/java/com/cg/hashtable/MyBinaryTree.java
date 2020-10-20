package com.cg.hashtable;

public class MyBinaryTree<K extends Comparable<K>> {

    MyBinaryNode<K> root;

    public void add(K key) {
        this.root = this.addRecursively(root, key);

    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null)
            return new MyBinaryNode<>(key);
        int compareResult = key.compareTo(current.key);
        if (compareResult == 0)
            return current;
        else if (compareResult < 0)
            current.left = addRecursively(current.left, key);
        else
            current.right = addRecursively(current.right, key);
        return current;
    }

    public int getSize() {
        return this.getSizeRecursively(root);

    }

    private int getSizeRecursively(MyBinaryNode<K> current) {
        return current == null ? 0 : 1 + this.getSizeRecursively(current.left) + this.getSizeRecursively(current.right);
    }

    public boolean search(K key) {
        return this.searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<K> current, K key) {
        boolean presence;
        System.out.println(current +""+key);
        if (key.compareTo(current.key) == 0) {
            presence = true;
        } else if (key.compareTo(current.key) > 0) {
            if (current.right == null)
                presence = false;
            else
                presence = searchRecursively(current.right, key);
        } else {
            if (current.left == null)
                presence = false;
            else
                presence = searchRecursively(current.left, key);
        }
        return presence;

    }


}
