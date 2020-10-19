package com.cg.hashtable;

import java.util.ArrayList;

public class HashMapUsingArrayList<K, V> {
    ArrayList<HashMapNode> myArrayList;

    public HashMapUsingArrayList() {
        myArrayList = new ArrayList<HashMapNode>(10);
        for (int i = 0; i < 10; i++) {
            myArrayList.add(null);
        }
    }

    public int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
//        System.out.println(key+"-->"+hashCode %10);
        return hashCode % 10;

    }

    //put
    public void put(K key, V value) {
        HashMapNode newNode = new HashMapNode(key, value);
        int index = getBucketIndex(key);
        HashMapNode head = myArrayList.get(index);
        if (head == null) {
            myArrayList.set(index, newNode);
        } else {
            HashMapNode node = searchInLinkedListAtIndex(head, key);
            if(node != null){
                node.setValue(value);
            }else{
                HashMapNode<K,V> current = head;
                while(current.next != null){
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }

    public HashMapNode<K,V> searchInLinkedListAtIndex(HashMapNode head, K key){
        HashMapNode<K,V> current = head;
        while(current != null){
            if(current.key.equals(key))
                return current;
            current = current.next;
        }
        return null;
    }
    //get
    public V get(K key) {
        int index = getBucketIndex(key);
        HashMapNode<K, V> head = myArrayList.get(index);
        if (head == null)
            return null;
        else {
            HashMapNode<K, V> current = head;
            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value;
                }
                current = current.next;
            }
            return null;
        }
    }

    //display
    public void display() {
        for (int i = 0; i < myArrayList.size(); i++) {
            HashMapNode<K, V> head = myArrayList.get(i);
            HashMapNode current = head;
            while (current != null) {
                System.out.println(current.toString());
                current = current.next;
            }
        }

    }

    //remove from Map
    public void remove(K key){
        int index = getBucketIndex(key);
        HashMapNode head = myArrayList.get(index);
        if(head.key.equals(key)){
            myArrayList.set(index, head.next);
        }else{
            HashMapNode<K,V> current = head.next;
            HashMapNode<K,V> previous = head;
            while(current != null){
                if(current.key.equals(key)){
                    previous.next = current.next;
                }
                current=current.next;
            }
        }
    }

}

