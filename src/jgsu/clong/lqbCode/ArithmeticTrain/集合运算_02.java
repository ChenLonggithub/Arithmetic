package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;
import java.util.TreeSet;

public class 集合运算_02 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> tset_1 = new TreeSet<Integer>();
        TreeSet<Integer> tset_2 = new TreeSet<Integer>();
        TreeSet<Integer> tset_3 = new TreeSet<Integer>();
        int n = sc.nextInt();
        while (n-- != 0) {
            int a = sc.nextInt();
            tset_1.add(a);
        }
        int m = sc.nextInt();
        while (m-- != 0) {
            int a = sc.nextInt();
            tset_2.add(a);
        }
        boolean flag = true;
        //交
        for (Integer temp : tset_1) {
            if (tset_2.contains(temp)) {
                if (flag) {
                    System.out.print(temp);
                } else {
                    System.out.print(" " + temp);
                }
                flag = false;
            }
        }
        System.out.println();
        flag = true;
        //并集
        for (Integer temp : tset_1) tset_3.add(temp);
        for (Integer temp : tset_2) tset_3.add(temp);
        for (Integer temp : tset_3) {
            if (flag) {
                System.out.print(temp);
            } else {
                System.out.print(" " + temp);
            }
            flag = false;
        }
        System.out.println();
        flag = true;
        //余
        for (Integer temp : tset_1) {
            if (!tset_2.contains(temp)) {
                if (flag) {
                    System.out.print(temp);
                } else {
                    System.out.print(" " + temp);
                }
                flag = false;
            }
        }
        System.out.println();

    }

}
