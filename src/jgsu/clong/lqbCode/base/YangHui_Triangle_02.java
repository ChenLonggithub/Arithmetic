package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class YangHui_Triangle_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][];

        // 遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            // 确定二维数组元素的大小
            arr[i] = new int[i+1];

//            // 打印空格
//            for (int j = 0; j < arr.length-i-1; j++) {
//                System.out.print("  ");
//            }

            // 遍历一维数组
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0 || arr[i].length-1 == j) {
                    // 三角形两腰全为 1
                    arr[i][j] = 1;
                }else {
                    // 其他元素等于两肩数字之和
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
