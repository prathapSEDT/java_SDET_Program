package com.rehansqapoint.staticinstancebloc;

public class StaticVsInstance {
    public static void main(String[] args) throws ClassNotFoundException {
        //how to load a class
       // Class.forName("com.rehansqapoint.staticinstancebloc.Test1");

        Test1 test1=new Test1();
       Test1 test2=new Test1();
    }
}
