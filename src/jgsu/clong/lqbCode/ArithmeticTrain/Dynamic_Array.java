package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamic_Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList aList=new ArrayList();

        for(int i=0;i<n;i++){
            aList.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<n;i++){
            int j=(int)aList.get(i);
            sum+=j;
        }
        System.out.println(sum+" "+sum/n);
    }
}
