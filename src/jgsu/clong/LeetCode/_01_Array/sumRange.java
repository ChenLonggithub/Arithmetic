package jgsu.clong.LeetCode._01_Array;

/**
 * 给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
 *
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 */
public class sumRange {
    static int[] a = {-2, 0, 3, -5, 2, -1};
    public static void main(String[] args) {
        System.out.println(sumRange(0,5));
    }
    public static int sumRange(int i,int j){
        if(i == j) return a[i];

        return a[i]+sumRange(i+1,j);
    }
}

/*
*
* 执行用时为 83 ms 的范例
class NumArray {
    int[] dp;
    public NumArray(int[] nums) {
        dp = new int[nums.length];
        if(nums.length != 0){
            dp[0] = nums[0];
            for(int i = 1; i < nums.length; i++){
                dp[i] = dp[i-1] + nums[i];
            }
        }
    }

    public int sumRange(int i, int j) {
        if(i == 0)return dp[j];
        return dp[j] - dp[i-1];
    }
}*/
