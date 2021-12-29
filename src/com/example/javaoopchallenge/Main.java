package com.example.javaoopchallenge;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient("Tom", 29,
                new Eye("Left eye", "Short sighted", "blue", true),
                new Eye("Right eye", "Normal", "green", true),
                new Heart("Heart", "Normal", 71),
                new Stomach("Stomach", "Pain", false),
                new Skin("Skin", "Burned", "White", 37));

        System.out.println("Name: " + patient.getName());
        System.out.println("Age: " + patient.getAge());

        Scanner scanner = new Scanner(System.in);

        boolean shouldFinish = false;

        while (!shouldFinish) {
            System.out.println("Choose an option: " +
                    "\n\t1. Left eye" +
                    "\n\t2. Right eye" +
                    "\n\t3. Heart" +
                    "\n\t4. Stomach" +
                    "\n\t5. Skin" +
                    "\n\t6. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    patient.getLeftEye().getDetails();
                    if (patient.getLeftEye().isOpened()) {
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1.Open the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getLeftEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    if (patient.getRightEye().isOpened()) {
                        System.out.println("\t\t1. Close the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().close();
                        } else {
                            continue;
                        }
                    } else {
                        System.out.println("\t\t1.Open the eye");
                        if (scanner.nextInt() == 1) {
                            patient.getRightEye().open();
                        } else {
                            continue;
                        }
                    }
                    break;

                case 3:
                    patient.getPatientHeart().getDetails();
                    System.out.println("\t\t1. Change the heart rate");
                    if (scanner.nextInt() == 1) {
                        System.out.println("Enter the new heart rate");
                        int newHeartRate = scanner.nextInt();
                        patient.getPatientHeart().setRate(newHeartRate);
                        System.out.println("Hear rate was changed. New heart rate is " + patient.getPatientHeart().getRate());
                    } else {
                        continue;
                    }
                    break;

                case 4:
                    patient.getPatientStomach().getDetails();
                    System.out.println("\t\t1. Digest food");
                    if (scanner.nextInt() == 1) {
                        patient.getPatientStomach().digesting();
                    } else {
                        continue;
                    }
                    break;

                case 5:
                    patient.getPatientSkin().getDetails();
                    break;

                default:
                    shouldFinish = true;
                    break;
            }
        }


    }
}
