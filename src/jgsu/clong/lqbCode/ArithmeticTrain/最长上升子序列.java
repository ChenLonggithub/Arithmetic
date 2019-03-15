package jgsu.clong.lqbCode.ArithmeticTrain;

public class 最长上升子序列 {
    public static void main(String[] args) {
        int []a = {389 ,207, 155 ,300, 299, 170, 158, 65 };
        System.out.println(lengthOfLIS(a));
    }
    public static int lengthOfLIS(int[] nums){
        if(nums.length == 0 || nums == null) return 0;

        int dp[] = new int[nums.length];
        int res = 1;
        for (int i = 0; i < dp.length; i++) {
            dp[i] = 1;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] > nums[i]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
