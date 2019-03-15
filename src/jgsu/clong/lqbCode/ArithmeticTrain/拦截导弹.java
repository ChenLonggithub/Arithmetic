package jgsu.clong.lqbCode.ArithmeticTrain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 问题描述
 * 某国为了防御敌国的导弹袭击，发展出一种导弹拦截系统。但是这种导弹拦截系统有一个缺陷：
 * 虽然它的第一发炮弹能够到达任意的高度，但是以后每一发炮弹都不能高于前一发的高度。某天，
 * 雷达捕捉到敌国的导弹来袭。由于该系统还在试用阶段，所以只有一套系统，因此有可能不能拦截所有的导弹。
 * 输入导弹依次飞来的高度（雷达给出的高度数据是不大于30000的正整数），计算这套系统最多能拦截多少导弹，
 * 如果要拦截所有导弹最少要配备多少套这种导弹拦截系统。
 */
public class 拦截导弹 {
    public static void main(String[] args) throws IOException {
        //输入操作
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //获取输入的字符，转为数组的形式
        String[] missile = reader.readLine().split(" ");
        reader.close();
        //飞行的高度
        int[] high = new int[missile.length];
        for (int i = 0; i < high.length; i++) {
            high[i] = Integer.parseInt(missile[i]);
        }
        //调用函数
        lengthOfLIS(high);

    }

    public static void lengthOfLIS(int[] nums) {
        //当没有导弹
        if (nums == null || nums.length == 0) System.out.println("0");
        //最多拦截导弹数
        int res = 1;
        //最少配备的系统数
        int min1 = 1;
        //动态规划，最大拦截的导弹数
        int[] dp = new int[nums.length + 1];
        //动态规划，最小所需系统数
        int[] min = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            min[i] =1;
        }
        //最长上升子序列，最长下降子序列的计算
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] >= nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }else{
                    min[i] = Math.max(min[i],min[j]+1);
                }
            }
            res = Math.max(res, dp[i]);
            min1= Math.max(min1, min[i]);
        }
        System.out.println(res);
        System.out.println(min1);
    }
}
