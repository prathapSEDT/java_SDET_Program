package com.rehansqapoint.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class TestEncap {
    public static void main(String[] args) {
List<EncapSulationImpl> empData=new ArrayList<EncapSulationImpl>();
        for(int i=1;i<=25;i++) {
            EncapSulationImpl en1 = new EncapSulationImpl();
            en1.setName("Prathap"+i);
            en1.setPlace("Hyderabad"+i);
            en1.setSalaray(75000*i);
            en1.setAge(45+i);
            empData.add(en1);
        }
        for (EncapSulationImpl encap:empData) {

            System.out.println(encap.getName());
            System.out.println(encap.getSalaray());
            System.out.println(encap.getPlace());
            System.out.println(encap.getAge());
            System.out.println("****************************");

        }



    }
}
