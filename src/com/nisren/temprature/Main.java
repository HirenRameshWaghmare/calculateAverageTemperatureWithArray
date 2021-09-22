package com.nisren.temprature;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many days temperature you want to calculate?");
        int numOfDays = scanner.nextInt();
        int[] tempDays = new int[numOfDays];
        //record temperature and find average
        int sum = 0;
        for (int i = 0; i<numOfDays; i++){
            System.out.println("Enter day "+(i+1)+"'s temperature: ");
            tempDays[i] = scanner.nextInt();
            sum = sum + tempDays[i];
//            sum+=temperature;
        }
        
        int above = 0;
        double average = sum / numOfDays;
        for (int i=0; i<tempDays.length; i++){
            if (tempDays[i]>average){
                above++;
            }
        }

        System.out.println();
        System.out.println("The Average temperature of the above mentioned days is: "+average);
        System.out.println("The temperature was above average for "+above+" days");
    }
}
