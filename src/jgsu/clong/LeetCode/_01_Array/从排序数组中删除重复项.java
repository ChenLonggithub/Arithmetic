package jgsu.clong.LeetCode._01_Array;

import java.util.ArrayList;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * <p>
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 */
public class 从排序数组中删除重复项<removeDuplicates_02> {
    public static void main(String[] args) {

        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int n = removeDuplicates(arr);

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //使用ArrayList来拿解决问题，好像目前思想是对的，但是运行不出来，
    /*public static int removeDuplicates_01(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        if (array.length == 0 || array == null) {
            return 0;
        } else if (array.length == 1) {
            return 1;
        } else {
            int i = 0;
            int n = array.length - 1;//数组的长度 - 1，数组的最后一个下标
            while (i <= n) {
                if (i == n) {
                    list.add(array[i]);
                } else {
                    int j = i + 1;
                    if (array[i] == array[j]) {
                        while (j <= n && array[i] == array[j]) {
                            j++;
                        }
                    }
                    list.add(array[i]);
                    i = j;
                }
            }

        }
        for (int k = 0; k < list.size(); k++) {
            array[k] = list.get(k);
        }
        return list.size();
    }*/

    public static int removeDuplicates_02(int[] array) {

        if (array.length == 0 || array == null) return 0;
        else if (array.length == 1) return 1;
        else {
            int temp = array[0];  //定义一个零时变量等于数组的第一个值
            int len = 1;
            for (int i = 1; i < array.length; i++) {
                if(temp == array[i]){
                    continue;
                }else {
                    temp = array[i];
                    array[len] = array[i];
                    len++;
                }

            }
            return len;
        }
    }
    //别人的代码讲解，时间最短
    public static int removeDuplicates(int[] nums) {
        int writtenIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[writtenIndex] != nums[i]) {
                ++writtenIndex;
                nums[writtenIndex] = nums[i];
            }
        }
        return writtenIndex + 1;
    }
}
