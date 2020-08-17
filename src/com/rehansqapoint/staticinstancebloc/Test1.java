package com.rehansqapoint.staticinstancebloc;

public class Test1 {

    Test1(){
        System.out.println("i am a zero argument based constructor");
    }

    static {
        System.out.println("i am a static block");
    }
    {
        System.out.println("i am a instance block");
    }
}
