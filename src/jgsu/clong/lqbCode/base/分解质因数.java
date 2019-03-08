package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 求出区间[a,b]中所有整数的质因数分解。
 */
public class 分解质因数 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (i >= 3) {
                int k = 2;    //定义一个变量来表示，i/a;来得到因子，K依次++
                String s = "";//定义一个字符串来存放不是质数的分解结果
                int j = i;

                while (j != k) { //当j ！= k时，分解这个数
                    if (j % k == 0) {
                        s = s + k + "*";
                        j = j / k;
                    } else if (j % k != 0) {
                        k++;
                    }
                }

                s = s + k;
                System.out.println(i + "=" + s);

            } else {
                System.out.println(i + "=" + i);
            }
        }


    }

}
