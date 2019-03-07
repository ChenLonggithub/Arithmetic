package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 给出n个数，找出这n个数的最大值，最小值，和。
 */
public class Base_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[0] = sc.nextInt();
            }
            if (i >= 1) {
                arr[i] = sc.nextInt();
                f(arr,i);
            }

        }
        System.out.println(arr[n-1]);
        System.out.println(arr[0]);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    private static void f(int[] arr, int i) {

        if(i == 0) return;
        if (arr[i - 1] > arr[i]) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
        f(arr,i-1);
    }
}
