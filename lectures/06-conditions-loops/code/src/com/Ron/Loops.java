package com.Ron;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
                  *** Syntax of for Loop ***
                  for ( initialization; condition; increment/ decrement ){
                       // body
                  }
         */

        // Q: Print numbers from 1 to 5
        for ( int i = 1; i <= 5; i++ ){
//            System.out.println(i);
        }

        // Q: Ask user to input a number and then iterate through the input numbers
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
            // let's say we want to print "hello world!" n number of times
//            System.out.println("hello World!");
//        }



//        *** while Loops ***
        /*
                Syntax :
                initialization;
                while(condition){
                    //body
                    increment/ decrement;
                }
         */

        // Q: Print numbers from 1 to 5
        int num = 1;
        while (num <= 5) {
//            System.out.println(num);
            num ++ ;
        }



//        *** do while ***
        /*
        ilSyntax:
        initialization;
        do {
            // body
            increment/ decrement;
        } whe (condition);

         */

        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);




    }
}
