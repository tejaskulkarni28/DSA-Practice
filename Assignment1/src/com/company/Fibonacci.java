package com.company;

public class Fibonacci {
    public static void main(String[] args) {
        // Write code here
        int a = 0;
        int b = 1;
        int N = 8;
        int sum = 0;

        while(N > 1){
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum);
            N--;
        }
    }
}
