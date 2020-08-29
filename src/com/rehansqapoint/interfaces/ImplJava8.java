package com.rehansqapoint.interfaces;

public class ImplJava8 implements Java8Impl,MyInterface{
    @Override
    public void add(int a, int b) {
        System.out.println("Custom add method");
    }
    public void myOwnMethod(){
        System.out.println("Its my own default method i am not going to change it");
    }

    public static void main(String[] args) {
        ImplJava8 implJava8=new ImplJava8();
        implJava8.add(10,20);
        implJava8.myOwnMethod();
        Java8Impl.testStaticMethod();
    }
}
