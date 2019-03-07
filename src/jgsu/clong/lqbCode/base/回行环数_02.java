package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class 回行环数_02 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=in.nextInt();
            }
        }
        int i=0;int j=0;int num=0;int om=0;int on=1;
        int sum=n*m;
        while(num<sum){
            while(i<m && num<sum){//往下
                if(num==sum-1){
                    System.out.print(a[i++][j]);
                    return;
                }
                System.out.print(a[i++][j]+" ");
                num++;
            }
            i--;j++;m--;//行数减一
            while(j<n&&num<sum){//往右
                if(num==sum-1){
                    System.out.print(a[i][j++]);
                    return;
                }
                System.out.print(a[i][j++]+" ");
                num++;
            }
            j--;i--;n--;//列数减一
            while(i>=om&&num<sum){//往上
                if(num==sum-1){
                    System.out.print(a[i--][j]);
                    return;
                }
                System.out.print(a[i--][j]+" ");
                num++;
            }
            j--;i++;om++;//上边界加1，每次往上输出一列，om++；
            while(j>=on&&num<sum){//往左
                if(num==sum-1){
                    System.out.print(a[i][j--]);
                    return;
                }
                System.out.print(a[i][j--]+" ");
                num++;
            }
            j++;i++;on++;//左边界加1
        }
    }
}
