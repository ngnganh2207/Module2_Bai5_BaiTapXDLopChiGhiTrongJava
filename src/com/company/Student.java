package com.company;

public class Student {
    private String name= "John";
    private String classes= "C02";
    private int age;

    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public Student(int age){
        this.age= age;
    }
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
