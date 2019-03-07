package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class FJ的字符串_02 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        String[] a = new String[n*n*n+1];
        for (int i = 1; i <= n; i++) {
            System.out.println(f(i,a));
        }

    }

    private static String f(int n,String[] a) {
        if(n == 1){
            a[n] = "A";
            return a[n];
        }
        a[n] = a[n-1] + (char) ('A' + n-1) + a[n-1];
        return a[n];
    }
}
