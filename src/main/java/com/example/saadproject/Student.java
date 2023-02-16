package com.example.saadproject;

public class Student {
    private String name;
    private int roll_no;
    private String country;
    private String school;

    public Student() {
    }


    public Student(String name, int roll_no, String country, String school) {
        this.name = name;
        this.roll_no = roll_no;
        this.country = country;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
