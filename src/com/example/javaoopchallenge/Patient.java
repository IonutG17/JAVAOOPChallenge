package com.example.javaoopchallenge;

public class Patient {
    private String name;
    private int age;
    private Eye leftEye;
    private Eye rightEye;
    private Heart patientHeart;
    private Stomach patientStomach;
    private Skin patientSkin;


    //Constructor
    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart patientHeart, Stomach patientStomach, Skin patientSkin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.patientHeart = patientHeart;
        this.patientStomach = patientStomach;
        this.patientSkin = patientSkin;
    }


    //Getters and setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public Heart getPatientHeart() {
        return patientHeart;
    }

    public Stomach getPatientStomach() {
        return patientStomach;
    }

    public Skin getPatientSkin() {
        return patientSkin;
    }
}
