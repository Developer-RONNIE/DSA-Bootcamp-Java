package com.Ron;

import java.util.Scanner;

/*   *** Armstrong Numbers Condition ***
 let consider original = 153
 cube sum = (1*1*1 + 5*5*5 + 3*3*3) = (1 + 125 + 27) = 153
 original == cube sum

 hence, it is an armstrong number

 */

public class QuestionArmstrong {
    public static void main(String[] args) {
        // Input of a number 
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println( isArmstrong( n));  // Checking if the number is an armstrong number 
        
//        Print all the 3 digits armstrong numbers 
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
            
        }

        
    }

     static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while ( n > 0){
            int rem = n % 10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
         return sum == original;


    }



}
