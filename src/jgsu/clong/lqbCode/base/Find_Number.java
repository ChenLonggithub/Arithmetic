package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Find_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int fin_num = sc.nextInt();

        for(int i = 0;i<arr.length;i++){
            if(fin_num == arr[i]){
                System.out.println(i+1);
                break;
            }
        }

    }
}
