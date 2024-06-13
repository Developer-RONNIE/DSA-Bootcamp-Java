package com.Ron;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);


        //        Name passed
//        String personalized = myGreet("Ronnie");
//        System.out.println(personalized);


//        Input name from user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String Name = in.next();
        String personalized = myGreet(Name); // *notice the arguments are changed but it still detects
        System.out.println(personalized);

    }

     static String myGreet(String name) {  // *arguments
//        String message = "Hello " + name;
//        return message;
        return "Hello " + name;
    }

    static String greet() {
//        String greeting = "Good Morning!";
//        return greeting;
        return "Good Morning!";
    }
}
