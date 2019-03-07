package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Special_Plalindrome_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = sc.nextInt();
        for (int i = 10000; i <= 1000000; i++) {
            if (i < 100000) {
                int a = i / 10000;
                int b = i % 10000 / 1000;
                int c = i % 1000 / 100;
                int d = i % 100 / 10;
                int e = i % 10;
                if (a == e && b == d && in == a + b + c + d + e) {
                    System.out.println(i);
                }
            } else {
                int a = i / 100000;
                int b = i % 100000 / 10000;
                int c = i % 10000 / 1000;
                int d = i % 1000 / 100;
                int e = i % 100 / 10;
                int f = i % 10;
                if (a == f && b == e && c == d && in == a + b + c + d + e + f) {
                    System.out.println(i);
                }
            }
        }
    }
}
