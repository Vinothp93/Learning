package com.collection.example;

public class Person {

    private int age;
    private String name;
    private String department;

    public String getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(String acctNumber) {
        this.acctNumber = acctNumber;
    }

    public MTN getMtn() {
        return mtn;
    }

    public void setMtn(MTN mtn) {
        this.mtn = mtn;
    }

    private String acctNumber;
    private MTN mtn;

    public Person(int age, MTN mtn, String acctNumber, String department, String name) {
        this.age = age;
        this.mtn = mtn;
        this.acctNumber = acctNumber;
        this.department = department;
        this.name = name;
    }

    public Person(int age, String name, String department) {
        this.age = age;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "com.collection.example.Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
