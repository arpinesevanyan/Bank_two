package com.codeschool;

import java.util.Calendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();

        Customer arpine=new Customer();
        int salery= random.nextInt(65000, 10000000);

        arpine.setSalary(salery);{
            System.out.println(salery);
        }

        Bank boss=new Bank();

        ACRA acra = new ACRA(new AcraRequest() {
            @Override
            public void acraRequest(int score) {
                System.out.println(score);
            }
        });

    }
    Calendar calendar=new Calendar() {
        @Override
        protected void computeTime() {

        }

        @Override
        protected void computeFields() {

        }

        @Override
        public void add(int field, int amount) {

        }

        @Override
        public void roll(int field, boolean up) {

        }

        @Override
        public int getMinimum(int field) {
            return 0;
        }

        @Override
        public int getMaximum(int field) {
            return 0;
        }

        @Override
        public int getGreatestMinimum(int field) {
            return 0;
        }

        @Override
        public int getLeastMaximum(int field) {
            return 0;
        }
    };



}
