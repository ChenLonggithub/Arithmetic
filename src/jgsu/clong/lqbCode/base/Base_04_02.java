package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 给出n个数，找出这n个数的最大值，最小值，和。
 */
public class Base_04_02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;int min = Integer.MAX_VALUE;int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
    }
}

