package com.api.assignment;

public class FibonacciExample1 {
    static int fib(int n)
    {
        if (n <= 1)
            return n;

        return fib(n - 1)
                + fib(n - 2);
    }
    public static void main(String args[]) {


        int n = 6;

        Double a =Math.floor((n-1)/10) + Math.floor((n-2)/10) + ((n-1) % 10) + ((n-2) % 10);
        System.out.println(a);
//        for (int i = 0; i < N; i++) {
//            System.out.print(fib(i) + " ");
//        }
//        System.out.print(fib(6) + " ");
    }
}
