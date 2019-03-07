package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class YangHui_Triangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(digui(i,j)+" ");
            }
            System.out.println();
        }
    }

    private static int  digui(int i, int j) {
        if (j == 1 || i == j) {
            return 1;
        } else {
            return digui(i - 1, j - 1) + digui(i - 1, j);
        }

    }
}
