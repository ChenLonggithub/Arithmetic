package jgsu.clong.lqbCode.Introduction;

import java.util.Scanner;

public class ListSum_02 {

    public static void main(String[] args) {

        long s1 = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long sum = n*(n+1)/2;
        System.out.println(sum);
        sc.close();

        long s2 = System.currentTimeMillis();
        System.out.println(s2-s1);



    }

}



