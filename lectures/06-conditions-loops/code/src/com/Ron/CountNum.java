package com.Ron;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {

//         Q: count the number of times 3 occurs in the given number
        int n = 634873;
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();

        int count = 0;
        while( n > 0 ){
            int rem = n % 10;
            if(rem == 3){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);

    }
}
