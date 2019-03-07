package jgsu.clong.lqbCode.base;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 高精度两个整数相加
 */
public class Precision_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigDecimal a = new BigDecimal(sc.next());
        BigDecimal b = new BigDecimal(sc.next());

        System.out.println(a.add(b));



    }
}
