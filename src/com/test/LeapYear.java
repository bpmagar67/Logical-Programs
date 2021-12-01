package com.test;

import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]) {
        int year, count = 0;
        boolean leap = false;
        Scanner inputNumScanner = new Scanner(System.in);

        System.out.println("Enter the Year: ");
        year = inputNumScanner.nextInt();
        System.out.println("Year entered is " + year);
        int y= year;
        while (y!= 0) {
            y = y / 10; //removes last digit of num
            count++;
        }
        if (count==4) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {

                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }
                else
                    leap = true;
            } else
                leap = false;

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
        else
            System.out.println("Year Entered in not 4 digit");
    }
}

