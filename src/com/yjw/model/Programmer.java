package com.yjw.model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Programmer {
    private List<String> car; /*有序*/
    private Set<String> pat;   /*无序*/
    private Map<String,String> info;
    private Properties Mysqlinfo;
    private String[] fruit;

    public List<String> getCar() {
        return car;
    }

    public void setCar(List<String> car) {
        this.car = car;
    }

    public Set<String> getPat() {
        return pat;
    }

    public void setPat(Set<String> pat) {
        this.pat = pat;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public Properties getMysqlinfo() {
        return Mysqlinfo;
    }

    public void setMysqlinfo(Properties mysqlinfo) {
        Mysqlinfo = mysqlinfo;
    }

    public String[] getFruit() {
        return fruit;
    }

    public void setFruit(String[] fruit) {
        this.fruit = fruit;
    }
}
