package com.cg.hashtable;

public class HashMapUsingLL<K, V> {

    MapLinkedList<K, V> myLinkedList;

    public HashMapUsingLL() {
        this.myLinkedList = new MapLinkedList<>();
    }

    //put(K key,V value)
    public void put(K key, V value) {
        HashMapNode<K, V> searchedNode = this.myLinkedList.search(key);
        if (searchedNode == null) {
            HashMapNode<K, V> newNode = new HashMapNode<>(key, value);
            this.myLinkedList.append(newNode);
        }
        else
            searchedNode.setValue(value);
    }

    public V get(K key){
        HashMapNode<K, V> searchedNode = this.myLinkedList.search(key);
        if(searchedNode == null)
            return null;
        return searchedNode.value;
    }

    public void display(){
        HashMapNode current=this.myLinkedList.head;
        while(current!=null)
        {
            System.out.println(current.toString());
            current=current.next;
        }

    }


}
