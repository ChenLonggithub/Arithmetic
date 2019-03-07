package jgsu.clong.lqbCode.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * 给出一列数{pi}={p0, p1, …, pn-1}，用这列数构造Huffman树的过程如下：
 * 　　1. 找到{pi}中最小的两个数，设为pa和pb，将pa和pb从{pi}中删除掉，然后将它们的和加入到{pi}中。这个过程的费用记为pa + pb。
 * 　　2. 重复步骤1，直到{pi}中只剩下一个数。
 * 　　在上面的操作过程中，把所有的费用相加，就得到了构造Huffman树的总费用。
 * 　　本题任务：对于给定的一个数列，现在请你求出用该数列构造Huffman树的总费用。
 */
public class Huffuman_Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            //a[i] = sc.nextInt();
            list.add(sc.nextInt());
        }
        int sum = 0;
        while (list.size() != 1){
            Collections.sort(list);
            int b = list.remove(0)+list.remove(0);
            sum = sum + b;
            list.add(b);
        }

        System.out.println(sum);
    }
}
