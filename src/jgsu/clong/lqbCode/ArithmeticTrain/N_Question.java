package jgsu.clong.lqbCode.ArithmeticTrain;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 7！=5040，因此7！最右边的那个非0的数字是4。再如，15！= 1307674368000，
 * 因此15！最右边的那个非0的数字是8。请编写一个程序，输入一个整数n(0<n<=100)，
 * 然后输出n!最右边的那个非0的数字是多少。
 */
public class N_Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        BigDecimal sum = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            sum = sum.multiply(BigDecimal.valueOf(i));
        }
        String s = sum.toString();

        for (int i = s.length()-1; i >= 0; i--) {
            if(s.charAt(i) != '0'){
                System.out.println(s.charAt(i));
                return;
            }
        }

    }
}
