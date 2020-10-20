package com.cg.hashtable;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Numbers_whenAddedtoBST_shouldReturn3() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(50);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(3, size);
    }

    @Test
    public void given13Numbers_whenAddedtoBST_shouldReturn13() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
        myBinaryTree.add(50);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        myBinaryTree.add(22);
        myBinaryTree.add(40);
        myBinaryTree.add(11);
        myBinaryTree.add(3);
        myBinaryTree.add(16);
        myBinaryTree.add(60);
        myBinaryTree.add(95);
        myBinaryTree.add(65);
        myBinaryTree.add(63);
        myBinaryTree.add(67);
        int size = myBinaryTree.getSize();
        Assert.assertEquals(13, size);

    }


}
