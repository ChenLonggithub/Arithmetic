package jgsu.clong.lqbCode.base;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Rabbit_Tortoise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v1,v2,t,s,len;
        v1=sc.nextInt();	//兔子速度v1
        v2=sc.nextInt();	//乌龟速度v2
        t=sc.nextInt();	    //领先t米或以上
        s=sc.nextInt();	    //休息s秒
        len=sc.nextInt();	//赛道长度l

        double t1=0,t2=0;      //兔子和乌龟所用的时间
        double s1=0,s2=0;        //兔子和乌龟所走的路程

        //比谁先跑到终点
        while (s1<len && s2<len){
            if(s1-s2>=t){   //兔子在休息，乌龟在跑
                t2+=s;      //把兔子休息的时间，加在乌龟上
                s1=v1*t1;
                s2=v2*t2;
            }else{          //兔子与乌龟一起跑
                t1++;
                t2++;
                s1=v1*t1;
                s2=v2*t2;
            }
        }
        if(s1<s2){//比各自走过的路程
            System.out.println("T");
            System.out.println(len/v2);
        }else if(s1==s2){
            System.out.println("D");
            System.out.println(len/v2);
        }else{
            System.out.println("R");
            System.out.println(len/v1);
        }
    }
}
