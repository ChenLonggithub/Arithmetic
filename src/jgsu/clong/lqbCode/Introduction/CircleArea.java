package jgsu.clong.lqbCode.Introduction;

import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();

        double s = Math.PI*r*r;

        System.out.printf("%.7f",s);


    }
}
