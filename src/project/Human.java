/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

public abstract class Human {

    protected int id;
    protected String name;
    protected int age;
    protected String address;
    protected String phone;
    protected String career;
    private static int count = 0;

    public Human() {
        this.id = ++Human.count;
    }

    public Human(String name, int age, String address, String phone) {
        this.id = ++Human.count;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public String getCareer() {
        return career;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Human.count = count;
    }

    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Address: " + getAddress());
    }
}
