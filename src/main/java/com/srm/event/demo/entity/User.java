package com.srm.event.demo.entity;

import java.util.Date;

public class User {
    private int age;
    private String name;
    private String address;
    private Date birthDay;

    public User(int age, String name, String address, Date birthDay) {
        this.age = age;
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }
}
