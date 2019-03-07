package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

/**
 * 从键盘输入一个大写字母，要求改用小写字母输出
 */
public class BigChar_to_Small {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(s.toLowerCase());
    }
}
