package com.teachmeskills.homework_13.task2;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class Runner2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY)) {
            date = date.plusDays(1);
        }
        System.out.println(date);
    }
}
