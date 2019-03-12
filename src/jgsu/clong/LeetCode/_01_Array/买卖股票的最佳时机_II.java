package jgsu.clong.LeetCode._01_Array;

/**
 * 输入: [7,1,5,3,6,4]
 * 输出: 7
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 3 天（股票价格 = 5）的时候卖出,
 * 这笔交易所能获得利润 = 5-1 = 4 。随后，在第 4 天（股票价格 = 3）的时候买入，
 * 在第 5 天（股票价格 = 6）的时候卖出,这笔交易所能获得利润 = 6-3 = 3 。
 */
public class 买卖股票的最佳时机_II {
    public static void main(String[] args) {
        //int[] arr = {1,2,3,4,5};
        //int[] arr = {7,6,4,3,1};
        int[] arr = {7,1,5,3,6,4};
        int n = maxProfit01(arr);
        System.out.println(n);
    }

    public static int maxProfit(int[] prices) {
        int p = 0;
        int a = 0;
        for (int i = 1; i < prices.length; i++) {
            p = prices[i] - prices[i - 1];
            if (p > 0)
                a += p;
        }
        return a;
    }

    public static int maxProfit01(int[] prices) {
        if(prices==null || prices.length<=1) return 0;
        int i=0;
        int valley=prices[0];
        int peak=prices[0];
        int maxprofit=0;
        while(i<prices.length-1){
            while(i<prices.length-1 && prices[i]>=prices[i+1]){
                i++;
            }
            valley=prices[i];//gu
            while(i<prices.length-1 && prices[i]<=prices[i+1]){
                i++;
            }
            peak=prices[i];//feng
            maxprofit +=peak-valley;
        }
        return maxprofit;
    }

/*    执行用时为 1 ms 的范例
    class Solution {
        public int maxProfit(int[] prices) {
            if(prices==null || prices.length<=1) return 0;
            int i=0;
            int valley=prices[0];
            int peak=prices[0];
            int maxprofit=0;
            while(i<prices.length-1){
                while(i<prices.length-1 && prices[i]>=prices[i+1]){
                    i++;
                }
                valley=prices[i];//gu
                while(i<prices.length-1 && prices[i]<=prices[i+1]){
                    i++;
                }
                peak=prices[i];//feng
                maxprofit +=peak-valley;
            }
            return maxprofit;
        }
    }*/


}
