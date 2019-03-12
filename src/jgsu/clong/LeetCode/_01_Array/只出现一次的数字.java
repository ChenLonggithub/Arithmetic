package jgsu.clong.LeetCode._01_Array;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 */
public class 只出现一次的数字 {
    public static void main(String[] args) {

        int[] a = {4,1,2,1,2};

        System.out.println(singleNumber(a));
    }

    public static int singleNumber(int[] nums) {
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            num = num ^ nums[i]; //异或操作。相同为0，不同为1
        }
        return num;
    }
}

/*
* 执行用时为 0 ms 的范例
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 1, len = nums.length; i < len; i += 2) {
            nums[0] ^= nums[i] ^ nums[i+1];
        }
        return nums[0];
    }
}*/
