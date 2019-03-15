package jgsu.clong.LeetCode.Dynamic_Programing;

import java.util.Scanner;

/**
 * 爬楼梯
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }
    //递归
    public static int climbStairs(int n) {
        if(n == 1) return 1;
        if (n == 2) return 2;

        return climbStairs(n-1)+climbStairs(n-2);
    }

    //动态规划
    public static int climbStairs_02(int n) {
        int[] a = new int[n];
        a[1] = 1;
        a[2] = 2;
        if(n == 1) return a[1];
        if(n == 2) return a[2];
        for (int i = 3; i <= a.length; i++) {
            a[i]  = a[i-1]+a[i-2];
        }
        return a[n];

    }

}
