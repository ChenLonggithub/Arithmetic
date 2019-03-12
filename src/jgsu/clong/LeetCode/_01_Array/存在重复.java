package jgsu.clong.LeetCode._01_Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 * 示例 2:
 *
 * 输入: [1,2,3,4]
 * 输出: false
 */
public class 存在重复 {
    public static void main(String[] args) {
        int[] a = {2,14,18,22,22};
                //{1,1,1,3,3,4,3,2,4,2};
        //int[] a = {1, 2, 3, 4};
        System.out.println(containsDuplicate(a));
        System.out.println(containsDuplicate_01(a));
    }

    public static boolean containsDuplicate(int[] a) {
        if (a.length == 0 || a.length == 1) {
            return false;
        } else {
            boolean flag_part = false;
            int count = 1;

            Arrays.sort(a);
            int t = a[0];

            for (int i = 1; i < a.length; i++) {

                if (t == a[i]) {
                    count++;
                } else {
                    t = a[i];
                }
                if (count >= 2) {
                    flag_part = true;
                    count = 1;
                }
            }

            return flag_part;
        }
    }

    public static boolean containsDuplicate_01(int[] a) {
        boolean f = false;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j <a.length; j++) {
                if (a[i] == a[j]) {
                    f = true;
                    break;
                }
            }
        }
        return f;
    }

    /*
    * 执行用时为 2 ms 的范例
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            if(nums.length < 2){
                return false;
            }
            int max = nums[0];
            for(int i = 1;i < nums.length;i++){
                if(nums[i] > max){
                    max = nums[i];
                }else if(nums[i] == max){
                    return true;
                }else{
                    for (int j = i - 1;j >= 0;j--){
                        if(nums[i] == nums[j]){
                            return true;
                        }
                    }
                }
            }
            return false;
    }*/
}
