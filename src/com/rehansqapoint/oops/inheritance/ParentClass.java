package com.rehansqapoint.oops.inheritance;

import java.math.BigDecimal;

public class ParentClass {
    public int age =10;
    public String name="Prathap";
    public String location="Hyderabad";
    public long phone=9626272284L;


    public void addUserToTheDataBase(){
        System.out.println("Adding student "+name+"to the database ");
    }

    public void searchUser(int id){
        System.out.println("The student with the id :"+id+" is available");
    }

    public void modifyStudentDetails(int id)
    {
        System.out.println("Modify the student data with the id :"+id);
    }

    public void deleteStudent(int id){
        System.out.println("Delete student with the id "+id);
    }



}
