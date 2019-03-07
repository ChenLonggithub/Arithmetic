package jgsu.clong.lqbCode.ArithmeticTrain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
 */
public class PaiXun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        List<Integer> list  = new ArrayList<>();
        for(int i = 0;i<3;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
