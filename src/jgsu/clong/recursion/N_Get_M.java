package jgsu.clong.recursion;

import java.util.Scanner;

/**
 * 在n个球中拿出 m 个球（不放回） 请问有多少种拿法
 */
public class N_Get_M {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(f(n,m));
    }

    private static int f(int n, int m) {
        if(m == n) return 1;
        if(m>n) return 0;
        if(m == 0) return 1;
        //假设n个球中有一个球为特殊球，先去掉那个球，
        //抽取m-1个，在将去掉的那个球中取m个 0 0 o 0  2
        return f(n-1,m-1) + f(n-1,m);
    }
}
