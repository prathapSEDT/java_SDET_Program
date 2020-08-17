package com.rehansqapoint.constructor;

public class ConstrcutorImpl {
    int a=34;
    int b=54;

    ConstrcutorImpl(){
        this(45);
        System.out.println("I am user created no arg constructor");

    }
    ConstrcutorImpl(int a){
        this(45,50);
        System.out.println("I am one arg constructor");
    }
    ConstrcutorImpl(int a,int b){

        System.out.println("I am user 2 arg constructor");
        System.out.println(this.a);
        System.out.println(this.b);

    }
    public static void main(String[] args) {
        ConstrcutorImpl constrcutor=new ConstrcutorImpl();

    }
}
