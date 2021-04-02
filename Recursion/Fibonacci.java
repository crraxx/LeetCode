package Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fib(10));
    }

    public static int fib(int n) {
        if (n < 2) {
            return n==1?1:0;
        }
        int m = fib(n-1)+fib(n-2);
        return m;
    }
}
