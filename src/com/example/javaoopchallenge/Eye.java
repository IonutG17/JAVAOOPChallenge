package com.example.javaoopchallenge;

public class Eye extends Organs {
    private String color;
    private boolean isOpened;


    //Constructor
    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }


    //Getters and setters
    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }


    //Methods
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
    }

    public void open(){
        this.setOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close(){
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }
}
