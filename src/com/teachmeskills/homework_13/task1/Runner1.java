package com.teachmeskills.homework_13.task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Runner1 {
    public static void main(String[] args) {
        System.out.println("Start");
        Date date = new Date();
        System.out.println(date);
        System.out.println("Enter a year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println("Enter a month");
        int month = scanner.nextInt();
        System.out.println("Enter a day");
        int day = scanner.nextInt();
        Calendar calendar = new GregorianCalendar(year, month, day);
        Date date1 = calendar.getTime();
        System.out.println(date1);
        scanner.close();
        System.out.println("End");
    }
}
