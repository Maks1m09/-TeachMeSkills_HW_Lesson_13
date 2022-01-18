package com.teachmeskills.homework_13.Task3;

import java.util.Scanner;

public class Runner3 {
    public static void main(String[] args) {
        System.out.println("Start");
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter what you want: 1 - text in reverse order; 2 - factorial calculation ");
        int number = scanner.nextInt();
        if (number == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter string to convert");
            String newLine = scanner1.nextLine();
            System.out.println(Class1.MyFunction1.result(newLine));
            scanner1.close();
        } else if (number == 2) {
            System.out.println("Enter a number to find the factorial");
            int numberForFactorial = scanner.nextInt();
            System.out.println(Class1.MyFunction2.result(numberForFactorial));
        } else {
            System.out.println("you entered something else");
        }
        scanner.close();
        System.out.println("End");
    }
}
