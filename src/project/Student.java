/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author vuong.thai22
 */
public class Student extends Human {

    private String className;

    public Student() {
        this.career = "Student";
    }

    public Student(String name, int age, String address, String phone, String className) {
        super(name, age, address, phone);
        this.career = "Student";
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
