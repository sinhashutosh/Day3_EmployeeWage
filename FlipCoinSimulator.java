package org.example;

import java.util.Random;

public class FlipCoinSimulator {
    public static void main(String[] args) {
        Random rd = new Random();
        int attendance = rd.nextInt(3);
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time_hour = 3;
        int wage = 0;
       // System.out.println(attendance);
        switch (attendance) {
            case 0:
                System.out.println(" Employee is Absent...");
                wage = full_day_hour * wage_per_hour * attendance;
                break;
            case 1:
                System.out.println(" Employee is Present Full Day...");
                wage = full_day_hour * wage_per_hour * attendance;
                break;
            case 2:
                System.out.println(" Employee worked Part Time...");
                wage = part_time_hour * wage_per_hour * attendance;
                break;
        }
                System.out.println(" Employee Daily Wage = " + wage + "₹");
    }
}
