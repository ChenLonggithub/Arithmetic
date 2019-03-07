package jgsu.clong.lqbCode.Introduction;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int res = fib(n)%10007;

        System.out.println(res);
    }

    private static int fib(int n) {
        if( n<0 || n> 1000000) {
            System.out.println("输入参数有误！");
            return n;
        }
        if(n==1 || n==2)return 1;
        return fib(n-1)+fib(n-2);
    }
}
