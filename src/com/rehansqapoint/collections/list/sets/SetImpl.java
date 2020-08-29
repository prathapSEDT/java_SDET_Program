package com.rehansqapoint.collections.list.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {
        Set set=new HashSet();

        set.add("Hari");
        set.add("Raj");
        set.add("Krish");
        set.add("Hari");

        set.remove("Raj");
        System.out.println(set);

    }
}
