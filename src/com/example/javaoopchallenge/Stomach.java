package com.example.javaoopchallenge;

public class Stomach extends Organs{
    private boolean isEmpty;


    //Constructor
    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }


    //Getters and setters
    public boolean isEmpty() {
        return isEmpty;
    }


    //Methods
    @Override
    public void getDetails() {
        super.getDetails();

        if (this.isEmpty()){
            System.out.println("Need food");
        } else {
            System.out.println("Stomach is full");
        }
    }

    public void digesting(){
        System.out.println("Begin digesting");
    }


}
