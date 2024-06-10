package com.Ron;

import java.util.Scanner;

public class Sum {
    public static void main (String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter Your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please Enter Your  number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);
    }
}
