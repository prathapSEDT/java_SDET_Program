package com.rehansqapoint.collections.list.sets;

import java.util.*;

public class TreeSet_Test {
    public static void main(String[] args) {
        Set set= new TreeSet();
        set.add(89);
        set.add(85);
        set.add(76);
        set.add(30);
        set.add(56);

       Iterator itr= ((TreeSet) set).descendingIterator();

       while (itr.hasNext())
       {
           System.out.println(itr.next());
       }

    }
}
