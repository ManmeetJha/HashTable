package com.cg.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {
    @Test
    public void given3Numbers_whenAddedtoBST_shouldReturn3{
        MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<>();
        myBinaryTree.add(50);
        myBinaryTree.add(30);
        myBinaryTree.add(70);
        int size=myBinaryTree.getSize();
        Assert.assertEquals(3,size);
    }
}
