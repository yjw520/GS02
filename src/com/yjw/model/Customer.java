package com.yjw.model;

public class Customer {
    private String name;
    private String sex="男";
    private double pi;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getPi() {
        return pi;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", pi=" + pi +
                '}';
    }
}
