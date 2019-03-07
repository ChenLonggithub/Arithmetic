package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class 数的读法 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int len = str.length();
        int n = len; //用来做循环判断
        int m = n; //用来遍历每一位
        int[] a = new int[n]; //保存输入的数字
        StringBuffer b = new StringBuffer(); //存放输出

        for (int i = 0; i < len; i++) {
            if (i < n - 1)
                a[i] = Integer.parseInt(str.substring(i, i + 1));
            else
                a[i] = Integer.parseInt(str.substring(n - 1));
        }

        for (int i = 0; i < len; i++) {
            if (len == 1 && a[i] == 0) {
                System.out.println("ling");
            }
            if (m == 10) { // 十亿
                if (a[i] == 1)
                    b.append("shi ");
                else
                    b.append("er shi ");
            }
            if (m == 9) { // 亿
                if (a[i] > 0) {
                    b.append(check(a[i]) + " yi ");
                } else {
                    if (a[i] == 0) {
                        b.append(" yi ");
                    }
                }
            }
            if (m == 8) { // 千万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " qian ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 7) { // 百万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " bai ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 6) { // 十万
                if (a[i] > 0) {
                    if (a[i] == 1) {
                        b.append("shi "); //注意：不能输入yi shi wan，而应该是shi wan
                    } else {
                        b.append(check(a[i]) + " shi ");
                    }
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 5) { // 万
                if (a[i] > 0) {
                    b.append(check(a[i]) + " wan ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    } else {
                        //注意:当千万,百万,十万位都为0且万位不为0时候,不会输出万,例如:十三亿,二十亿
                        if (a[i - 1] != 0 || a[i - 2] != 0 || a[i - 3] != 0)
                            b.append("wan ");
                    }
                }
            }
            if (m == 4) { // 千
                if (a[i] > 0) {
                    b.append(check(a[i]) + " qian ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 3) { // 百
                if (a[i] > 0) {
                    b.append(check(a[i]) + " bai ");
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 2) { // 十
                if (a[i] > 0) {
                    if (a[i] == 1) {
                        b.append("shi "); //注意：不能输入yi shi，而应该是shi
                    } else {
                        b.append(check(a[i]) + " shi ");
                    }
                } else {
                    if (a[i] == 0 && a[i + 1] != 0) {
                        b.append("ling ");
                    }
                }
            }
            if (m == 1) { // 个
                if (a[i] > 0) {
                    b.append(check(a[i]));
                }
            }
            m--;
        } // End for
        System.out.println(b);
    }

    public static String check(int i) {
        String s = "";
        switch (i) {
            case 1:
                s = "yi";
                break;
            case 2:
                s = "er";
                break;
            case 3:
                s = "san";
                break;
            case 4:
                s = "si";
                break;
            case 5:
                s = "wu";
                break;
            case 6:
                s = "liu";
                break;
            case 7:
                s = "qi";
                break;
            case 8:
                s = "ba";
                break;
            case 9:
                s = "jiu";
                break;
        }
        return s;
    }
}
