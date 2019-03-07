package jgsu.clong.lqbCode.Introduction;

import java.util.Scanner;

public class Fibonacci_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mod = 10007;
        int arr[] = new int[1000000];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i - 1] + arr[i - 2]); //求得arr[n]并取模
        }
        System.out.println(arr[n]% mod);
    }
}
