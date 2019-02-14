package com.personal.Sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SortedMapTest {
    @Test
    public void testMap(){

        Map<String,Integer> unsortedMap=new HashMap<String,Integer>();
        unsortedMap.put("a",7);
        unsortedMap.put("b",89);
        unsortedMap.put("c",64);
        unsortedMap.put("d",19);
        for (Map.Entry<String,Integer> entry :unsortedMap.entrySet()){
            System.out.println(entry);
        }
        Map<String,Integer> expected=new LinkedHashMap<String, Integer>();
        expected.put("a",7);
        expected.put("d",19);
        expected.put("c",64);
        expected.put("b",89);
        Assert.assertEquals(expected,SortedMap.getSortedMap(unsortedMap));
    }
}