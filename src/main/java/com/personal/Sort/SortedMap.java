package com.personal.Sort;

import java.util.*;

public class SortedMap {
    public static Map getSortedMap(Map<String,Integer> unsortedMap){
        Map<String,Integer> sortedMap=new LinkedHashMap();

        ArrayList<Integer> values = new ArrayList<Integer>();
        ArrayList<String> keys = new ArrayList<String>();
        String tempKey[];
        Set<Map.Entry<String, Integer>> entries = unsortedMap.entrySet();
        for (Map.Entry<String,Integer> entry : entries){
             keys.add(entry.getKey());
             values.add(entry.getValue());
        }
        int count=values.size();
        for(int i=0;i<count;i++){
            Integer value=Collections.min(values);
            int index = values.indexOf(value);
            String key=keys.get(index);
            sortedMap.put(key,value);
            keys.remove(index);
            values.remove(index);
            System.out.println(keys);
            System.out.println(values);
        }
        System.out.println(sortedMap);
        return sortedMap;
    }
}
