package org.example;

import java.util.Random;

public class FlipCoinSimulator {
    public static void main(String[] args) {
        Random rd = new Random();
        int attendance = rd.nextInt(2);
        System.out.println(attendance);
        if (attendance == 1 ) {
            System.out.println(" Employee is Present...");
        } else {
            System.out.println(" Employee is Absent...");
        }
    }
}
