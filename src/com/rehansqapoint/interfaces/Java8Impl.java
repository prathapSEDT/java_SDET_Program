package com.rehansqapoint.interfaces;

public interface Java8Impl {
    default void myOwnMethod(){
        System.out.println("Its my own default method i am not going to change it");
    }
   

    void add(int a,int b);

    static void testStaticMethod(){
        System.out.println("Test static method");
    }
    static void testMethod1(){
        System.out.println("Test static method");
    }
}
