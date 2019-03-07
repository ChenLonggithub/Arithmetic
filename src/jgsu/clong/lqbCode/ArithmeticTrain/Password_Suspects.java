package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

/**
 *  Password Suspects
 *  输入格式
 * 　　第一行包含两个整数N和M，分别表示密码的长度和已知的密码中子串的数量。接下来M行，每行一个密码中的已知子串。
 * 输出格式
 * 　　第一行输出Y，Y表示可能的密码的数目。如果Y不超过42，接下来按照字典序，每行一个密码，依次输出所有可能的密码。
 * 样例输入
 * 10 2
 * hello
 * world
 * 样例输出
 * 2
 * helloworld
 * worldhello
 *
 * 样例输入
 * 10 0
 * 样例输出
 * 141167095653376
 * 样例输入
 * 4 1
 * icpc
 *
 * 样例输出
 * 1
 * icpc
 */
public class Password_Suspects {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //两个整数N和M，分别表示密码的长度和已知的密码中子串的数量
        int n = sc.nextInt();
        int m = sc.nextInt();
        String [] s = new String[m];
        for (int i = 0; i < m; i++) {
            s[i] = sc.next();
        }



    }
}
