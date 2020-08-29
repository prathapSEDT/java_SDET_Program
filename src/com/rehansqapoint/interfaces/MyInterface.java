package com.rehansqapoint.interfaces;

public interface MyInterface {
    default void myOwnMethod(){
        System.out.println("Its my own default method i am not going to change it");
    }
}
