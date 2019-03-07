package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Rabbit_Tortoise {

    public static void main(String[] args) throws InterruptedException {

        int v1=25,v2=10,t=20,s=3,l=100;

        Scanner scanner=new Scanner(System.in);
        v1=scanner.nextInt();
        v2=scanner.nextInt();
        t=scanner.nextInt();
        s=scanner.nextInt();
        l=scanner.nextInt();
        int sum1=0,sum2=0;
        boolean stop=false;
        int stopcount=0;
        int i=0;
        for ( i = 0; i < l/v2; i++) {
            if(sum1>=l||sum2>=l)//如果有一个跑到了终点就结束了
                break;
            if(stopcount==s)
                stop=false; //如果休息的时间够了，就开始跑
            if(sum1-sum2>=t)
                stop=true; //如果超过了t米，就休息
            if(!stop)
                sum1+=v1; //当兔子不休息的时候跑
            else
                stopcount++; //休息的时间计数
            sum2+=v2;//乌龟每次都会跑
        }
        if(sum1==sum2) {
            System.out.println("D");
            System.out.println(i);
        }else if(sum1>=l) {
            System.out.println("R");
            System.out.println(i);
        }else if(sum2>=l){
            System.out.println("T");
        System.out.println(i);}
    }
}
