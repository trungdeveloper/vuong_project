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
public class Teacher extends Human {

    private String faculty;

    public Teacher() {
        this.career = "Teacher";
    }

    public Teacher(String name, int age, String address, String phone, String faculty) {
        super(name, age, address, phone);
        this.career = "Teacher";
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String Faculty) {
        this.faculty = Faculty;
    }
}
