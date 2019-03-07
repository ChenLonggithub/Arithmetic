package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

public class 最小公倍数 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(ZXGBS(x,y));
    }

    private static int ZXGBS(int x, int y) {

        return x*y/ZDGYS(x,y);
    }

    private static int ZDGYS(int x, int y) {
        return f(x,y);
    }

    private static int f(int x, int y) {
        if(x == 0) return y;
        return f(y%x,x);
    }
}
