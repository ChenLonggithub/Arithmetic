package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 23321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 */
public class Special_Plalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                for (int k=0;k<10;k++){
                    for (int m=0;m<10;m++){
                        for (int w=0;w<10;w++){
                            if(i == w && j == m && i+j+k+m+w==n){
                                System.out.println(""+i+j+k+m+w);
                            }
                            for (int y=0;y<10;y++){
                                if(i == y && j == w && k==m && i+j+k+m+w+y == n){
                                    System.out.println(""+i+j+k+m+w+y);
                                }
                            }
                        }

                    }

                }
            }
        }
    }
}
