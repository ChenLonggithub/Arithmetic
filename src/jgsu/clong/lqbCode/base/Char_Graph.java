package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 *
 * ABCDEFG
 *
 * BABCDEF
 *
 * CBABCDE
 *
 * DCBABCD
 *
 * EDCBABC
 *
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 */
public class Char_Graph {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[] s = new char[51];

        for (int i = 0; i < 26; i++) {
            s[i] = (char) Integer.parseInt(String.valueOf('A' + i));
            s[50-i] = (char) (65 + i);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++){
                System.out.print(s[j]);
            }
            System.out.println();
            for (int j = 49; j >= 0; j--){
                s[j + 1] = s[j];
            }
            s[0] = s[50];
        }
    }
}
