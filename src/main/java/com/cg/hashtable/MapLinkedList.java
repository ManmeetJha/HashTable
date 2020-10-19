package com.cg.hashtable;

public class MapLinkedList<K, V> {
    HashMapNode<K, V> head;

    public HashMapNode<K, V> search(K key) {
        if (head == null)
            return null;
        else {
            HashMapNode<K, V> current = head;
            while (current != null) {
                if (current.key.equals(key))
                    return current;
                current = current.next;
            }
            return null;
        }
    }

    public void append(HashMapNode<K, V> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            HashMapNode<K, V> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = null;
        }
    }

}
