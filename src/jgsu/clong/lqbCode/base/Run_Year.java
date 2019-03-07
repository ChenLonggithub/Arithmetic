package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Run_Year {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        if( (year%4==0&&year%100!=100)||year%400==0)
            System.out.println("yes");
        else {
            System.out.println("no");
            scanner.close();
        }
    }
}
