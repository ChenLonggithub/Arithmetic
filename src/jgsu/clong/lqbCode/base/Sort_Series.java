package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Sort_Series {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        Scanner sc2 = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            sc2.hasNext();
            arr[i] = sc2.nextInt();
        }

        for(int i=0;i<arr.length-1;i++){//外层循环控制排序趟数
            for(int j=0;j<arr.length-1-i;j++){//内层循环控制每一趟排序多少次
                if(arr[j]>arr[j+1]){
                    int tem = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        for (int k = 0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
