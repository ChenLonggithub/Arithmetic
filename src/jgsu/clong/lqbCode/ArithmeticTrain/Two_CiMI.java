package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 任何一个正整数都可以用2进制表示，例如：137的2进制表示为10001001。
 * 　　将这种2进制表示写成2的次幂的和的形式，令次幂高的排在前面，可得到如下表达式：
 *     137=2^7+2^3+2^0
 * 　　现在约定幂次用括号来表示，即a^b表示为a（b）
 * 　　此时，137可表示为：2（7）+2（3）+2（0）
 * 　　进一步：7=2^2+2+2^0 （2^1用2表示）
 * 　　3=2+2^0
 * 　　所以最后137可表示为：2（2（2）+2+2（0））+2（2+2（0））+2（0）
 */
public class Two_CiMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        fun(Integer.toBinaryString(scan.nextInt()));
    }

    public static void fun(String number) {

        for (int i = 0; i < number.length(); i++) {

            if (number.charAt(i) == '1') {
                if (i == number.length() - 1) {
                    System.out.print("2(0)");
                } else if (i == number.length() - 2) {
                    System.out.print("2");

                    if (number.charAt(i + 1) == '1') {
                        System.out.print("+");
                    }

                } else {
                    System.out.print("2(");
                    fun(Integer.toBinaryString(number.length() - 1 - i));
                    System.out.print(")");

                    if(number.substring(i+1).contains("1")){
                        System.out.print("+");
                    }
                }
            }

        }
    }
}
