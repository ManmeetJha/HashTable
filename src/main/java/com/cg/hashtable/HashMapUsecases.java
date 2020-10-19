package com.cg.hashtable;

public class HashMapUsecases {
    public static void main(String[] args) {
        //executeUC1();
        //executeUC2();
        executeUC3();
    }

    private static void executeUC1() {
        HashMapUsingLL<String, Integer> myMap = new HashMapUsingLL<>();
        String input = "To be or not to be";
        String[] inputArray = input.toLowerCase().split(" ");
        for (String word : inputArray) {
            Integer valueInMap = myMap.get(word);
            if (valueInMap != null) {
                myMap.put(word, valueInMap + 1);
            } else {
                myMap.put(word, 1);
            }
        }
        myMap.display();
    }

    private static void executeUC2() {
        HashMapUsingArrayList<String, Integer> myMap = new HashMapUsingArrayList<>();
        String input = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] inputArray = input.toLowerCase().split(" ");
        for (String word : inputArray) {
            Integer valueInMap = myMap.get(word);
            if (valueInMap != null) {
                myMap.put(word, valueInMap + 1);
            } else {
                myMap.put(word, 1);
            }
        }
        myMap.display();
    }

    private static void executeUC3(){
        HashMapUsingArrayList<String, Integer> myMap = new HashMapUsingArrayList<>();
        String input = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] inputArray = input.toLowerCase().split(" ");
        for (String word : inputArray) {
            Integer valueInMap = myMap.get(word);
            if (valueInMap != null) {
                myMap.put(word, valueInMap + 1);
            } else {
                myMap.put(word, 1);
            }
        }
        System.out.println(myMap.get("avoidable"));
        myMap.remove("avoidable");
        System.out.println(myMap.get("avoidable"));
    }

}
