package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * FJ在沙盘上写了这样一些字符串：
 * 　　A1 = “A”
 * 　　A2 = “ABA”
 * 　　A3 = “ABACABA”
 * 　　A4 = “ABACABADABACABA”
 * 　　… …
 * 　　你能找出其中的规律并写所有的数列AN吗？
 */
public class FJ的字符串 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(f(n));

    }

    private static String f(int n) {
        if(n == 1){
            return "A";
        }
        return f(n - 1) + (char) ('A' + n-1) + f(n - 1);
    }
}
