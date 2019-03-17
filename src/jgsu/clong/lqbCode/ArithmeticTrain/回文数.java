package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;
/**
 * 问题描述
 * 　　若一个数（首位不为零）从左向右读与从右向左读都一样，我们就将其称之为回文数。
 * 　　例如：给定一个10进制数56，将56加65（即把56从右向左读），得到121是一个回文数。
 * <p>
 * 　　又如：对于10进制数87：
 * 　　STEP1：87+78 = 165 STEP2：165+561 = 726
 * 　　STEP3：726+627 = 1353 STEP4：1353+3531 = 4884
 * <p>
 * 　　在这里的一步是指进行了一次N进制的加法，上例最少用了4步得到回文数4884。
 * <p>
 * 　　写一个程序，给定一个N（2<=N<=10或N=16）进制数M（其中16进制数字为0-9与A-F），求最少经过几步可以得到回文数。
 * 　　如果在30步以内（包含30步）不可能得到回文数，则输出“Impossible!
 */
public class 回文数 {
    /*
     * scale字符串对应的是十六进制以内，各个输的范围，在做加法时，用每个字符对应的index相加即可
     */
    static final String scale = "0123456789ABCDEF";


    /*
     * 判断是否为回文数，是返回true,否则返回false
     */
    public static boolean isPlindrome(String s) {
        String str = String.valueOf(s);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    /*
     * 将字符串反转，返回一个字符串
     */
    public static String digitalReversal(String s) {
        StringBuffer sb = new StringBuffer("");
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(String.valueOf(s.charAt(i)));
        }
        return sb.toString();
    }

    /*
     * 高精度加法，得到一个数与其数为反转后的数的和，返回为一个字符串
     */
    public static String add_AB(String A, String B, int k) {
        int i, j;
        int temp = 0;
        int len = A.length();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        StringBuffer sb = new StringBuffer("");
        for (i = 0; i < len; i++) {
            int m = scale.indexOf(String.valueOf(a[i])) + scale.indexOf(String.valueOf(b[i])) + temp;
            if (m >= k) {
                temp = m / k;
                m = m % k;
            } else {
                temp = 0;
            }
            sb.append(String.valueOf(scale.charAt(m)));
        }
        if (temp != 0) {
            sb.append(String.valueOf(scale.charAt(temp)));
        }
        return digitalReversal(sb.toString());
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int k = input.nextInt();
        String s = input.next();
        int count = 0;
        while (!isPlindrome(s) && count <= 30) {
            s = add_AB(s, digitalReversal(s), k);
            count++;
//			System.out.println(s);
        }
        if (isPlindrome(s)) {
            System.out.println("STEP=" + count);
        } else {
            System.out.println("Impossible!");
        }
    }
}
