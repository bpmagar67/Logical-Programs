package com.test;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number of coin clip");
        int num=scan.nextInt();
        System.out.println("Total Number of coin flipped: "+num);
        int h=0;
        int t=0;
        for (int i=0; i<num; i++)
        {
            double a=Math.random();
            System.out.println(a);
            if (a<0.5){
                t++;
            }
            else {
                h++;
            }
        }
        int percentage=(h*100/num);
        int percentage1=(t*100/num);
        System.out.println("Head Percentage is "+percentage+"%");
        System.out.println("Tail Percentage is "+percentage1+"%");
    }
}

