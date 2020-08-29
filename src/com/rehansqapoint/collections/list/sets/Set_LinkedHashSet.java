package com.rehansqapoint.collections.list.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
    public static void main(String[] args) {
        Set<String> myset=new LinkedHashSet<>();
        myset.add("Hari");
        myset.add("Raj");
        myset.add("Rahul");
        myset.add("Rahul");
        System.out.println(myset);

        Iterator iter=myset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
