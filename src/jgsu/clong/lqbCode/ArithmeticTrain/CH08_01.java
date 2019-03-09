package jgsu.clong.lqbCode.ArithmeticTrain;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 样例输入
 * 1 7 26 25
 * 样例输出
 * zrf is:1/7; ssh is:26/25
 * (zrf==ssh) is:0; (zrf<ssh) is:1
 */
public class CH08_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();

        sc.close();

        String ab1 = f(a1,b1);
        String ab2 = f(a2,b2);

        System.out.println(ab1+";"+ab2);


    }

    private static String f(int a1, int b1) {
        int k = Math.min(a1,b1);
        int j = 3;
        while(a1 != 1 & b1 != 1 & j != k){
            for (int i=2; i <= k; i++) {
                if(a1%i == 0 & b1%i == 0){
                    a1 = a1/i;
                    b1 = b1/i;
                    j++;
                    break;
                }else{
                    continue;
                }
            }
        }
        return a1+"/"+b1;
    }

}
