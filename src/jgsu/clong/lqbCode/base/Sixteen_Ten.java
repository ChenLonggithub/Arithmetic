package jgsu.clong.lqbCode.base;

import java.util.Scanner;
public class Sixteen_Ten {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c[]=s.toCharArray();    //将字符串对象中的字符转换为一个字符数组
        int n=c.length;
        long sum=0;
        //long型的取值范围：-9223372036854775808~9223372036854775807
        for(int i=0;i<n;i++){
            if((int)c[i]-48>9){
                if(c[i]=='A')
                    sum+=10*Math.pow(16,n-i-1);
                else if(c[i]=='B')
                    sum+=11*Math.pow(16,n-i-1);
                else if(c[i]=='C')
                    sum+=12*Math.pow(16,n-i-1);
                else if(c[i]=='D')
                    sum+=13*Math.pow(16,n-i-1);
                else if(c[i]=='E')
                    sum+=14*Math.pow(16,n-i-1);
                else if(c[i]=='F')
                    sum+=15*Math.pow(16,n-i-1);
            }
            else{
                sum+=((int)c[i]-48)*Math.pow(16,n-i-1);
            }
        }
        System.out.println(sum);
    }

}
