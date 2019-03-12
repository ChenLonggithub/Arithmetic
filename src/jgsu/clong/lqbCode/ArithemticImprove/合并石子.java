package jgsu.clong.lqbCode.ArithemticImprove;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 　　在一条直线上有n堆石子，每堆有一定的数量，每次可以将两堆相邻的石子合并，
 *      合并后放在两堆的中间位置，合并的费用为两堆石子的总数。求把所有石子合并成一堆的最小花费。
 * 样例输入
 * 5
 * 1 2 3 4 5
 * 样例输出
 * 33
 */
public class 合并石子 {

    public static void mergeStone(int[][] dp, int[] sum) {
        int j = 0, temp = 0;
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
            dp[i][i] = 0;
        }
        for (int len =2;len <=dp.length; len++){ //划分的石子堆数

            for (int i = 0; i < dp.length - len + 1; i++) {
                j = i + len - 1;

                for (int k = i; k < j; k++) {
                    temp = dp[i][k] + dp[k + 1][j] + sum[j] - (i == 0 ? 0 : sum[i - 1]);
                    dp[i][j] = Math.min(dp[i][j], temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scam = new Scanner(System.in);
        int n = scam.nextInt();
        int[] sum = new int[n];
        int[][] dp = new int[n][n];
        for (int i = 0; i < sum.length; i++) {
            if (i == 0)
                sum[i] = scam.nextInt();
            else
                sum[i] = sum[i - 1] + scam.nextInt();
        }
        mergeStone(dp, sum);
        System.out.println(dp[0][n - 1]);
    }
}

