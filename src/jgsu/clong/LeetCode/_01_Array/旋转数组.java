package jgsu.clong.LeetCode._01_Array;

/**
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class 旋转数组 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7};
//        rotate(a,3);

        f(a,3);
    }

    /*private static void rotate(int[] array, int k) {
        int length = array.length;
        // 假设移动的位数是newk,那么无论是向右还是向左移动newk+n*length个位置之后,移动到还是原来的位置
        int newk = k % length;
        int temp = 0;
        for(int i = 0; i < newk; i++) {
            // 这个temp保存的是这个数组的一个元素
            temp = array[length - 1];
            for(int j = length - 2; j >= 0; j--) {
                // 让后一个元素等于前面的元素,相当于后面的元素是被前面的元素覆盖了
                array[j+1] = array[j];
            }
            // 第一个元素在每一个循环结束之后就要把之前的临时变量填充后进去
            // 因为临时变量保存的是每一次的最后一个位置的元素
            array[0] = temp;
        }
    }*/

    public static void f(int[] array, int k) {
        int n = array.length;
        int newk= k%n;
        for (int i = 0; i < newk; i++) {
            int t = array[n-1];
            for (int j = n-2; j >= 0; j--) {
                array[j+1] = array[j];
            }
            array[0] = t;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                System.out.print(array[i]+",");
            }else{
                System.out.print(array[i]);
            }

        }
        System.out.println("]");
    }

    public static void rotate_01(int[] nums, int k) {
        int length = nums.length;
        int newk = k%length;
        int[] newArr = new int[length];
        for (int i = 0; i < nums.length; i++) {
            int position = (i+newk)%length;
            newArr[position] = nums[i];
        }
        nums = newArr;
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if(i != nums.length-1){
                System.out.print(nums[i]+",");
            }else{
                System.out.print(nums[i]);
            }

        }
        System.out.println("]");

    }
}
