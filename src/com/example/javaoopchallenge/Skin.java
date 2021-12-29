package com.example.javaoopchallenge;

public class Skin extends Organs{
    private String color;
    private int softness;


    //Constructor
    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }


    //Getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }


    //Method
    @Override
    public void getDetails() {
        super.getDetails();

        System.out.println("Skin color: " + this.getColor());
    }
}
