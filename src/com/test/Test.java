package com.test;

import java.util.Scanner;

public class Test {
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
            if((year%4==0) && (year%100!=0) || (year%400==0)){
                leap=true;
            }
            if(leap){
                System.out.println("leap year");
            }
            else{
                System.out.println("not leap year");
            }
        }
        else
            System.out.println("Year Entered in not 4 digit");
    }
}

