package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

public class BigSmall_Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] ss = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if(s.substring(i,i+1).equals((s.substring(i,i+1)).toLowerCase())){
                ss[i] = s.substring(i,i+1).toUpperCase();
            }else{
                ss[i] = s.substring(i,i+1).toLowerCase();
            }
            System.out.print(ss[i]);
        }

    }
}
