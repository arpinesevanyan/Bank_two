package com.codeschool;

import java.util.Calendar;

public class Calendar1{
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        System.out.println("The current date is:" + calendar.getTime());
        calendar.add(Calendar.DATE, +30);
        System.out.println("30 days ago:" + calendar.getTime());
        Calendar1 calendar1=new Calendar1();

    }
}
