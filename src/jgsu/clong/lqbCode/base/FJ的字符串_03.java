package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class FJ的字符串_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        f(sc.nextInt());
    }


    public static void f(int n) {
        if (n == 1) {
            System.out.print("A");

        } else {
            f(n - 1);
            System.out.print((char) (n + 64));
            f(n - 1);
        }

    }
}
