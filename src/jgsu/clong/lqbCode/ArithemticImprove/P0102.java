package jgsu.clong.lqbCode.ArithemticImprove;


import java.util.Scanner;

/**
 * 用户输入三个字符，每个字符取值范围是0-9，A-F。然后程序会把这三个字符转化为相应的十六进制整数，
 * 并分别以十六进制，十进制，八进制输出，十六进制表示成3位，八进制表示成4位，若不够前面补0。
 * （不考虑输入不合法的情况）
 * 输入
 * 　　1D5
 * 输出
 * （注意冒号后面有一个空格）
 * 　　Hex: 0x1D5
 * 　　Decimal: 469
 * 　　Octal: 0725
 */
public class P0102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Hex: 0x" + s);
        int k = Integer.parseInt(s, 16);//将16进制字符串转化为10进制整数
        System.out.println("Decimal: " + k);
        s = Integer.toOctalString(k);//将10进制整数转化为8进制字符串
        System.out.print("Octal: ");
        for (int i = 0; i < 4 - s.length(); ++i)
            System.out.print("0");
        System.out.println(s);
    }
}
