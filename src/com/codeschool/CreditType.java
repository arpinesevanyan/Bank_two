package com.codeschool;


public enum CreditType {
    BUSINESS(20000000, 6, 60),
    CONSUMER(5000000, 18, 60),
    MORTGAGE(50000000, 7, 120);


    CreditType(int amount, int percent, int timetable) {
        this.amount = amount;
        this.percent = percent;
        this.timetable = timetable;

    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public int getTimetable() {
        return timetable;
    }

    public void setTimetable(int timetable) {
        this.timetable = timetable;
    }

    private int amount;
    private int percent;
    private int timetable;


}