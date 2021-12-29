package com.example.javaoopchallenge;

public class Organs {
    private String name;
    private String medicalCondition;


    //Constructor
    public Organs(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }


    //Method
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Medical condition: " + this.getMedicalCondition());
    }

}
