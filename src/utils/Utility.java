package utils;


import java.util.ArrayList;
import java.util.HashMap;

public class Utility<T> {
        public HashMap<T, Integer> listToHashMap(ArrayList<T> list){
            HashMap<T, Integer> frequencyMap = new HashMap<>();

            for (T item : list) {
                frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
            }

            return frequencyMap;
        }
    }


