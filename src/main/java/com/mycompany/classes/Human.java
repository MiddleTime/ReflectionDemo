
package com.mycompany.classes;


public class Human {
    public int age;
    public String name;

//    public Human() {
//        this.age = 2;
//        this.name = "Vasya";
//    }
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.age + " " + this.name;
    }

}