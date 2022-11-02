package com.zlm.test1;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionTest {
    public static void testArray() {
        Integer[] strs = new Integer[]{1,2,3};
        for(int i=0; i<strs.length; i++) {
            System.out.println(strs[i]);
        }
    }

    public static void testList() {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("zlm");
        arrayList.add("wdd");
        for(int i=0; i<arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        List<String> arrayList1 = new CopyOnWriteArrayList<>();
        arrayList1.add("alm");
        arrayList1.add("zdd");
        for (String name: arrayList1) {
            System.out.println(name);
        }
    }

    public static void testSet() {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("alm");
        stringSet.add("zdd");
        stringSet.add("wdd");
        for (String name: stringSet) {
            System.out.println(name);
        }
    }

    public static void testMap(String name) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("zlm", "123456");
        stringMap.put("wdd", "12345678");
        System.out.println(stringMap.get(name));
    }


    public static void main(String[] args) {
        testArray();
        testList();
        testSet();
        testMap("zlm");
    }
}
