package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Sixteen_Eight {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        String eight[] = new String[n];
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt(16);

            int a = Integer.parseInt(Integer.toString(arr[i]),10);
            String b = Integer.toHexString(a);
            eight[i] = b;
        }

        for (int j = 0;j<arr.length;j++){
            System.out.println(eight[j]);
        }



    }
}
