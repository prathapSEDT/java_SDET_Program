package com.rehansqapoint.constructor;

public class ChildClassConst extends ParentClassCons{

    int c=90;
    int d=89;
    int a=345;
    int b=890;
    public static void main(String[] args) {

        ParentClassCons p=new ChildClassConst();
        p.add();
        p.sub();


    }

@Override
public void add(){
        System.out.println("child class add");
    }
    public void myOwnMethod(){
        System.out.println("my own method");
    }


}
