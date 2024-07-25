package org.creational.prototype.good;

public class Student2 implements IPrototype {
    public String name;
    public int age;
    private int rollNumber;

    public Student2(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }


    @Override
    public IPrototype clone() {
        return new Student2(this.name,this.age,this.rollNumber);
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
