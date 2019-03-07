package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Sort_Series_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            //读入一个数
            a[i] = sc.nextInt();
            //将这个数插入到一个有序的子数组中
            for(int j = i;j > 0; j--){
                if(a[j] < a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }else{
                    //已经插入到了合适的位置，可以跳出里层循环
                    break;
                }
            }
        }
        sc.close();

        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
