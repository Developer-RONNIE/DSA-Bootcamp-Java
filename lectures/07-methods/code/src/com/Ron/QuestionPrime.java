package com.Ron;

import java.util.Scanner;

public class QuestionPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);


    }

    private static boolean isPrime(int n) {
        if ( n<= 1){
            return false;
        }
        int c = 2;
        while ( c* c > n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }
}
