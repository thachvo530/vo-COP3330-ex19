/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Thach Vo
 */

package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".0");

        System.out.print("Enter weight in pounds: ");
        double W = scan.nextDouble();

        System.out.print("Enter height in inches: ");
        double H = scan.nextDouble();

        double BMI = (W / (H * H)) * 703;

        if (BMI >= 18.5 && BMI <= 25) {

            System.out.print("Your BMI is "+df.format(BMI)+".\n");
            System.out.print("You are within the ideal weight range.");

        }

        if (BMI < 18.5) {
            System.out.print("Your BMI is "+df.format(BMI)+".\n");
            System.out.print("You are underweight. You should see your doctor.");

        }

        if (BMI > 25) {

            System.out.print("Your BMI is "+df.format(BMI)+".\n");
            System.out.print("You are overweight. You should see your doctor.");
        }
        
    }
}
