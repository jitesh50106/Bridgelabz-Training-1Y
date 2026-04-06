package com.gla;

public class Student extends Person {

    private int rollNumber;
    private int year;
    private Branch branch;

    public Student() {}

    public Student(int id, String name, String email, int rollNumber, int year, Branch branch) {
        super(id, name, email);
        this.rollNumber = rollNumber;
        this.year = year;
        this.branch = branch;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }
}