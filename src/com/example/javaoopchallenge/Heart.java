package com.example.javaoopchallenge;

public class Heart extends Organs{
    private int rate;


    //Constructor
    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }


    //Getters and setters
    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }


    //Method
    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Heart rate: " + this.getRate());
    }

}
