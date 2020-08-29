package com.rehansqapoint.encapsulation;

public class EncapSulationImpl implements Comparable<EncapSulationImpl>{
    private String name;
    private String place;
    private int age;
    private double salaray;

    @Override
    public String toString() {
        return "EncapSulationImpl{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                ", salaray=" + salaray +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaray() {
        return salaray;
    }

    public void setSalaray(double salaray) {
        this.salaray = salaray;
    }

    @Override
    public int compareTo(EncapSulationImpl obj) {
        return (int) (this.salaray-obj.salaray);
    }
}
