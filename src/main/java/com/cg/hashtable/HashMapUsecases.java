package com.cg.hashtable;

public class HashMapUsecases {
    public static void main(String[] args) {
        executeUC1();
    }

    private static void executeUC1() {
        HashMapUsingLL<String, Integer> myMap = new HashMapUsingLL<>();
        String input = "To be or not to be";
        String[] inputArray = input.toLowerCase().split(" ");
        for(String word: inputArray){
            Integer valueInMap = myMap.get(word);
            if(valueInMap != null){
                myMap.put(word,valueInMap+1);
            }else{
                myMap.put(word,1);
            }
        }
        myMap.display();
    }


}
