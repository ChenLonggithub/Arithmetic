package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 任何一个正整数都可以用2的幂次方表示。例如：
 * 　　137=27+23+20
 * 　　同时约定方次用括号来表示，即ab 可表示为a（b）。
 * 　　由此可知，137可表示为：
 * 　　2（7）+2（3）+2（0）
 * 　　进一步：7= 22+2+20 （21用2表示）
 * 　　3=2+20
 * 　　所以最后137可表示为：
 * 　　2（2（2）+2+2（0））+2（2+2（0））+2（0）
 * 　　又如：
 * 　　1315=210 +28 +25 +2+1
 * 　　所以1315最后可表示为：
 * 　　2（2（2+2（0））+2）+2（2（2+2（0）））+2（2（2）+2（0））+2+2（0）
 */
public class 幂方分解 {
    static String s = new String("");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f2(n);

    }

    public static void f2(int n) {
        if (n == 1) {
            System.out.print("2(0)");
            return;
        }
        if (n == 2) {
            System.out.print("2");
            return;
        }
        int p = 1;
        int s = 0;
        while (p <= n) {
            p = p * 2;
            s++;
        }
        s = s - 1;
        if (n == p / 2) {
            System.out.print("2(");
            f2(s);
            System.out.print(")");
        } else {
            if (p / 2 == 2) {
                System.out.print("2");
                System.out.print("+");
                f2(n - p / 2);
            } else {
                System.out.print("2(");
                f2(s);
                System.out.print(")+");
                f2(n - p / 2);
            }
        }

    }
    /*private static String f2(int n) {

        List<Integer> list = new LinkedList<Integer>();

        int t, u = n;
        while (true) {
            t = u % 2;
            u = u / 2;
            list.add(t);
            if (u == 0) break;
        }

        int count = 0;
        for (int i = list.size()-1; i >= 0; i--) {
            if (list.get(i) == 1) {
                if (count > 0) {
                    s = s + "+";
                }
                if (i == 1) s += "2";
                if (i == 0) s += "2(0)";
                if (i != 0 && i != 1) {
                    s += "2(" + f2(i) + ")";
                }
                count = 1;
            }
        }
        return s;
    }*/

}
