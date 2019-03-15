package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

/**
 * 问题描述
 * 　　有一长度为N(1<=Ｎ<=10)的地板，给定两种不同瓷砖：一种长度为1，另一种长度为2，数目不限。要将这个长度为N的地板铺满，一共有多少种不同的铺法？
 * 　　例如，长度为4的地面一共有如下5种铺法：
 * 　　4=1+1+1+1
 * 　　4=2+1+1
 * 　　4=1+2+1
 * 　　4=1+1+2
 * 　　4=2+2
 * 　　编程用递归的方法求解上述问题。
     * 样例输入
     * 4
     * 样例输出
 * 5
 */
public class 瓷砖铺放 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();

        int[] dp = new int[N];
        System.out.println(f1(N));

    }

    private static int  f1(int n) {
        if(n <=2) return n;
        return f1(n-1)+f1(n-2);
    }



}
