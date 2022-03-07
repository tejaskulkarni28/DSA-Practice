package com.company;

public class fibonacciNumber {
    public static void main(String[] args) {
        int fib = 4;
        int gotFib = getFib(fib);
        System.out.println(gotFib);
    }
    static int getFib(int n){
        // base condition
        if(n < 2){
            return n;
        }

        return getFib(n-1) + getFib(n-2);
    }
}
