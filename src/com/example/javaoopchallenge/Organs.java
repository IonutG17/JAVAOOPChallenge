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

    public void setName(String name) {
        this.name = name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }


    //Method
    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Medical condition: " + this.getMedicalCondition());
    }

}
