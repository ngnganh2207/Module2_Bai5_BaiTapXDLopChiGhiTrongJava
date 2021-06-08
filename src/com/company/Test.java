package com.company;

public class Test {
    public static void main(String[] args) {
        Student studentA= new Student();
        //System.out.println(studentA.getName());
        //System.out.println(studentA.getClasses());
        studentA.setName("Musk");
        studentA.setClasses("C03");
        System.out.println(studentA.getName());
        System.out.println(studentA.getClasses());
    }
}
