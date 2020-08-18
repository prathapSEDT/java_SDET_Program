package com.rehansqapoint.oops.inheritance;

public class DPS_2 extends DPS{
    public void addStudentToMusic(){
        System.out.println("Adding student to music class");
    }
    public void addStudentToCricket(){
        System.out.println("Adding student to cricket class");
    }

    public static void main(String[] args) {
        DPS_2 dps_2=new DPS_2();

        dps_2.addUserToTheDataBase();
        dps_2.addStudentToKarate();
        dps_2.addStudentToCricket();
        dps_2.searchUser(45);
    }
}
