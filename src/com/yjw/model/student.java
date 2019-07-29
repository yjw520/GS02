package com.yjw.model;

public class student {
    private String username;
    private String password;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }
    public student()
    {
    }
    public student(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public student(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
