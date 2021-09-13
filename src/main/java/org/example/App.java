package org.example;
import java.util.Scanner;
import java.util.Calendar;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cody Kalczuk
 */

public class App {

    //main method
    public static void main(String[] args) {
        int currentAge;                                                 //store user current age
        int retirementAge;                                              //store user retirement age
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your current age? ");
        currentAge = sc.nextInt();                                       //taking user input
        System.out.print("At what age would you like to retire? ");
        retirementAge = sc.nextInt();                                   //taking user input

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);         // store the current year
        int yearsLeftToRetirement = retirementAge-currentAge;               // store the value of total years left to retirement

        if(yearsLeftToRetirement >= 0) {                // checking if years left to retirement is more than 0;

            int retirementYear = currentYear + yearsLeftToRetirement;
            System.out.println("You have "+yearsLeftToRetirement +" years left until you can retire.");
            System.out.println("It's "+currentYear+", so you can retire in "+retirementYear+".");
        }else {
            System.out.println("You can already retire");               //if negative number than this statement gets printed
        }

    }

}