package com.codeschool;

import java.util.Random;

public class ACRA implements AcraRequest{
    Random random=new Random();
    Customer customer=new Customer();
    int salary= random.nextInt();
    int score= random.nextInt();

    public ACRA(AcraRequest acraRequest) {

    }

    public boolean blocked(){
        if(score< 400 && score>0){
            return false;
        }
        return true;
    }

    public int x2() {
        if (score > 400 && score < 500) {
            return salary * 2;
        }
        return 0;
    }

    public int x5(){
            if(score> 501 && score<700){
                return salary*5;
            }
        return 0;
    }

    public int x10(){
        if(score> 701 && score<800){
            return salary*10;
        }
        return 0;
    }

    @Override
    public void acraRequest(int score) {

    }
}
