package jgsu.clong.lqbCode.ArithmeticTrain;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 * 比如01 和10 是一对相反答案，并且我们发现01=1，10=2，并且1+2=2^2-1，
 * 同理对于110和001，我们发现110=6，001=1，并且6+1=2^3-1，以此类推，
 */
public class Aesthetic_Lesson_02 {

    //定义一个足够大的数组存放学生的判断
    public static int[][] arr = new int[50001][21];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //定义一个数组存放每一行的二进制和
        int arr1[] = new int[50001];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
            //对每一行的二进制转换为10进制的和
            for (int j = 0; j < m; j++) {
                arr1[i] += arr[i][j] * Math.pow(2, m - j - 1);
            }
        }
        //计算2的 m 次幂 - 1 的和
        int a1 = (int) Math.pow(2, m) - 1;
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == (a1 - arr1[j])) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
