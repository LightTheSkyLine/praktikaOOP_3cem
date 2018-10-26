package com.company;

public class Student{
    public int IDNumber;
    public String Name;
    Student (int a, String b){
        IDNumber = a;
        Name = b;
    }
    @Override
    public String toString() {
        return IDNumber + " " + Name;
    }
}