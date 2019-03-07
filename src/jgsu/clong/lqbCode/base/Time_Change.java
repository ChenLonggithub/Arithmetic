package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 给定一个以秒为单位的时间t，要求用“<H>:<M>:<S>”的格式来表示这个时间。<H>表示时间，
 * <M>表示分钟，而<S>表示秒，它们都是整数且没有前导的“0”。例如，若t=0，
 * 则应输出是“0:0:0”；若t=3661，则输出“1:1:1”。
 */
public class Time_Change {
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);

        int n = sc.nextInt();

        int h = n/3600;
        int m = n%3600 / 60;
        int s = n%3600 % 60;

        System.out.println(h+":"+m+":"+s);

    }
}
