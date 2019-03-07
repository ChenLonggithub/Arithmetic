package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Ten_Sixteen_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char c[] = new char[100];
        int i = 0;
        if(n == 0){
            System.out.println(n);
        }else {
            while (n != 0) {
                int t = n % 16;
                if (t >= 0 && t < 10) {
                    c[i] = (char) (t + '0');
                    i++;
                } else {
                    c[i] = (char) (t + 'A' - 10);
                    i++;
                }
                n = n / 16;
            }
        }
        for(int j = i-1;j>=0;j--){
            System.out.print(c[j]);
        }
    }
}
