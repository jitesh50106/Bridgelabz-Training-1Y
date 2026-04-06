package com.gla;

public class Faculty extends Person {

    private String subject;

    public Faculty() {}

    public Faculty(int id, String name, String email, String subject) {
        super(id, name, email);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}