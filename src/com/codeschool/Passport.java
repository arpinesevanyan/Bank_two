package com.codeschool;

public class Passport {
    private String ID;
    private String name;
    private String surName;
    private String bDay;


    public Passport() {
        this.ID = ID;
        this.name = name;
        this.surName = surName;
        this.bDay = bDay;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getbDay() {
        return bDay;
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;
    }
}