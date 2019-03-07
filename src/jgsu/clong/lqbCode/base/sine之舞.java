package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class sine之舞 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        S(n);
    }

    static void S(int n) {
        for (int i = 1; i < n; i++) {       //输出括号
            System.out.print("(");
        }
        for (int i = 1; i <= n; i++) {

            A(i);
            System.out.print("+" + (n - i + 1));
            if (i != n)
                System.out.print(")");
        }

    }

    private static void A(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("sin(" + i);
            if (i % 2 == 0 && i != n)
                System.out.print("+");

            else if (i % 2 != 0 && i != n) {
                System.out.print("-");
            }
        }
        for (int i = 1; i <= n; i++)
            System.out.print(")");

    }

}
