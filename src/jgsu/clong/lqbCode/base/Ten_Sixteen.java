package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Ten_Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        char[] c = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        StringBuffer sb = new StringBuffer();
        String s = null;
        if(x == 0){
            System.out.println(0);
        }else{
            while(x != 0){
                sb = sb.append(c[x%16]);
                x = x/16;
            }
            System.out.println(sb.reverse().toString());
        }

    }
}
