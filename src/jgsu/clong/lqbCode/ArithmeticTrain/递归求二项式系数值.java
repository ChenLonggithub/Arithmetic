package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

public class 递归求二项式系数值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n= sc.nextInt();
        System.out.println(f(k,n));
    }

    public static int f(int k,int n) {
        //int[][] a = new int[n][k];
        if(k == n || k == 0){
            return 1;
        }
        return f(k,n-1) + f(k-1,n-1);

    }
}
