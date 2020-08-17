package com.rehansqapoint.singletonclass;

public class TestSingleTonClass {
    public static void main(String[] args) {
        SingletonClassImpl singletonClass=SingletonClassImpl.getInstance();
        SingletonClassImpl singletonClass2=SingletonClassImpl.getInstance();
        SingletonClassImpl singletonClass3=SingletonClassImpl.getInstance();
        SingletonClassImpl singletonClass4=SingletonClassImpl.getInstance();

    }
}
