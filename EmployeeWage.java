package org.example;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Random rd = new Random();
        int attendance = rd.nextInt(2);
        int wage_per_hour = 20;
        int full_day_hour = 8 ;
        int wage = 0;
        System.out.println(attendance);
        if (attendance == 1 ) {
            System.out.println(" Employee is Present...");
            wage = full_day_hour * wage_per_hour * attendance;
        } else {
            System.out.println(" Employee is Absent...");
            wage = full_day_hour * wage_per_hour * attendance;
        }
        System.out.println(" Employee Daily Wage = "+wage+"₹");
    }
}
