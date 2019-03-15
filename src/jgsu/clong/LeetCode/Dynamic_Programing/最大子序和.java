package jgsu.clong.LeetCode.Dynamic_Programing;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * <p>
 * 示例:
 * <p>
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class 最大子序和 {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 0 || nums == null) return 0;

        int[] dp = new int[nums.length];
        dp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
        }
        int res = dp[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(res, dp[i]);
        }
        return res;
    }

    /*//{-2, 1, -3, 4, -1, 2, 1, -5, 4}
    public int maxSubArray(int[] nums) {
        int all, start, i;
        all = nums[nums.length - 1];//4
        start = nums[nums.length - 1];//4

        for(i = nums.length - 2; i >= 0; i--) {
            if(start < 0) {
                start = 0;
            }
            start += nums[i];
            if(start > all) {
                all = start;
            }
        }

        return all;
    }*/
}
