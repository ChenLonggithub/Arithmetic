package jgsu.clong.lqbCode.Introduction;

import java.util.Scanner;

public class ListSum {

    public static void main(String[] args) {

        long s1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = f(n);
        System.out.println(sum);

        long s2 = System.currentTimeMillis();
        System.out.println(s2-s1);



    }

    private static long f(long n) {
        if(n == 1) return 1;
        return f(n-1)+n;
    }
}
