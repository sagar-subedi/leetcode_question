package basic.array;


import utils.Utility;

import java.util.ArrayList;
import java.util.HashMap;

public class Q01TwoWaySum {

    public class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    public  ArrayList<Pair<Integer, Integer>> twoSumUnoptimized(ArrayList<Integer> arr, int target, int n) { //O(n^2)
        // Write your code here.
        ArrayList<Integer> usedIndex = new ArrayList<Integer>();
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<Pair<Integer, Integer>>();
        for(int i =0; i < arr.size(); i++){
            for(int j = i+1; j < arr.size(); j++){
                if(arr.get(i) + arr.get(j) == target){
                    Pair<Integer, Integer> pair = new Pair<>(arr.get(i), arr.get(j));
                    if(!usedIndex.contains(i) &&
                            !usedIndex.contains(j)){
                        result.add(pair);
                        usedIndex.add(i);
                        usedIndex.add(j);
                        break;
                    }
                }
            }
        }
        if(result.isEmpty()){
            result.add(new Pair<Integer, Integer>(-1,-1));
        }

        // System.out.println(result);
        return  result;
    }

    public  ArrayList<Pair<Integer, Integer>> twoSumOptimized(ArrayList<Integer> arr, int target, int n){
        Utility<Integer> utility = new Utility<>();
        ArrayList<Pair<Integer, Integer>> result = new ArrayList<Pair<Integer, Integer>>();

        HashMap<Integer, Integer> frequencyHashMap = (utility.listToHashMap(arr));
        System.out.println(frequencyHashMap);
        System.out.println(result);

        return  result;
    }
}