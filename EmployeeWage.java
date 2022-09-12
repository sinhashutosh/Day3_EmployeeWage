package org.example;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Random rd = new Random();
        int wage_per_hour = 20;
        int full_day_hour = 8;
        int part_time_hour = 3;
        int wage = 0;
        int month = 20;
        int month_wage = 0;
        for (int i = 1; i <= month; i++) {
            int attendance = rd.nextInt(2);
            if (attendance == 1) {
                int time = 0 + rd.nextInt(2);
                if (time == 1) {
                    //System.out.println(" Employee is Present Full Day...");
                    wage = full_day_hour * wage_per_hour * attendance;
                    month_wage += wage;
                } else if (time == 0) {
                    //System.out.println(" Employee worked Part Time...");
                    wage = part_time_hour * wage_per_hour * attendance;
                    month_wage += wage;
                }

            } else {
               // System.out.println(" Employee is Absent...");
                wage = full_day_hour * wage_per_hour * attendance;
            }
        }
        System.out.println(" Employee Monthly Wages = " + month_wage + "₹");
    }
}
