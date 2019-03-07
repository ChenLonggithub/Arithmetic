package jgsu.clong.lqbCode.base;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * n!的阶乘
 */
public class N_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BigInteger sum = new BigInteger("1");
        if(n == 0 || n == 1){
            System.out.println(1);
        }else{
            for (int i = 1; i <= n ; i++) {
                sum = sum.multiply(new BigInteger(i+""));
            }
            System.out.println(sum);
        }

    }
}
