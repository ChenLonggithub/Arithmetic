package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 十六進制轉換為十進制
 */
public class Sixteen_Ten_02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();

        int n = c.length;
        long sum = 0;
        for (int i= 0; i < n; i++)
            if ((int) c[i] - '0' > 9) {
                switch (c[i]) {
                    case 'A':{
                        sum += 10*Math.pow(16,n-i-1);
                        break;
                    }case 'B':{
                        sum += 11*Math.pow(16,n-i-1);
                        break;
                    }case 'C':{
                        sum += 12*Math.pow(16,n-i-1);
                        break;
                    }case 'D':{
                        sum += 13*Math.pow(16,n-i-1);
                        break;
                    }case 'E':{
                        sum += 14*Math.pow(16,n-i-1);
                        break;
                    }case 'F':{
                        sum += 15*Math.pow(16,n-i-1);
                        break;
                    }

                }
            }else{
                sum+=(c[i]-48)*Math.pow(16,n-i-1);
            }
        System.out.println(sum);
    }
}
