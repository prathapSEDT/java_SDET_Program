package com.rehansqapoint.singletonclass;

public class SingletonClassImpl {
    private static SingletonClassImpl singletonClass;

    private SingletonClassImpl(){
        System.out.println("Creating an object to the class");
    }

    public static SingletonClassImpl getInstance(){
        if(singletonClass==null)singletonClass=new SingletonClassImpl();
        return singletonClass;
    }


}
