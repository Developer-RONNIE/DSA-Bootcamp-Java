package com.Ron;

public class Reverse {
    public static void main(String[] args) {

//        Q: Make the reverse of the given number

        int n = 27865;

        int rev = 0;
        while(n > 0){
            int rem = n % 10;
            n = n/10;

            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
