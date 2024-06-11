package com.Ron;

import java.util.Scanner;

public class Fibonacci {
/*    what is Fibonacci number ?
0, 1, 1, 2, 3, 5, 8, 13, ...

here,
0, 1 , (0+1)= 1, (1+1)= 2, (1+2)= 3, (2+3)= 5, (3+5)= 8, (5+8)= 13, ....

 */



//    Q: Find the nth Fibonacci Number
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while ( count <= n){
            int temp = b;
            b = b+ a;
            a = temp;
            count++ ;
        }
        System.out.println(b);
    }
}
