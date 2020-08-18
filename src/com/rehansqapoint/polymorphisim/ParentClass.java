package com.rehansqapoint.polymorphisim;

public class ParentClass {
    //overloading
    public Object getData(String testCase,String fieldName){
        String data="Getting data from excel";
        return data;
    }

    public String getData(String testCase,String fieldName,int iteration){
        String data="Getting data from excel for the iteration "+iteration;
        return data;
    }



}
