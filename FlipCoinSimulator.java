package org.example;

import java.util.Random;

public class FlipCoinSimulator {
    public static void main(String[] args) {
        Random rd = new Random();
        int attendance = rd.nextInt(2);
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time_hour = 3;
        int wage = 0;
        System.out.println(attendance);
        if (attendance == 1) {
            int time =  0 + rd.nextInt(2);
            System.out.println(time);
            if (time == 1) {
                System.out.println(" Employee is Present Full Day...");
                wage = full_day_hour * wage_per_hour * attendance;
            } else if (time == 0) {
                System.out.println(" Employee worked Part Time...");
                wage = part_time_hour * wage_per_hour * attendance;
            }

        } else {
            System.out.println(" Employee is Absent...");
            wage = full_day_hour * wage_per_hour * attendance;
        }
        System.out.println(" Employee Daily Wage = " + wage + "₹");
    }
}
