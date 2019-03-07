package jgsu.clong.lqbCode.base;

import java.util.Scanner;

/**
 * 回形取数就是沿矩阵的边取数，若当前方向上无数可取或已经取过，则左转90度。
 *      一开始位于矩阵左上角，方向向下。
 */
public class 回形取数 {
    public static void main(String[] args) {
/*        Scanner key=new Scanner(System.in);
        int m=key.nextInt();
        int n=key.nextInt();
        int [][]a=new int [m][n];
        for(int j=0;j<m;j++){
            for(int k=0;k<n;k++){
                a[j][k]=key.nextInt();
            }
        }
        int i,count=0,aa = 0,g=m-1,r=n-1;
        while(true){
            for(i=aa;i<=g;i++){
                System.out.print(a[i][aa]+" ");
                count++;
            }
            for(i=aa+1;i<=r;i++){
                System.out.print(a[g][i]+" ");
                count++;
            }
            for(i=g-1;i>=aa;i--){
                System.out.print(a[i][r]+" ");
                count++;
            }
            for(i=r-1;i>aa;i--){
                System.out.print(a[aa][i]+" ");
                count++;
            }
            if(count==m*n) break;
            aa++;
            g--;
            r--;
        }*/
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m = sc.nextInt();//相关变量的录入
        int[][] s=new int[n][m];
        for(int i=0;i<n;i++) {            //棋盘具体值的录入（0或1）
            for(int j=0;j<m;j++){
                s[i][j]=sc.nextInt();
            }
        }

        int count = 0,a = 0,j = n-1,k = m-1,i;
        while(true){

            for (i = a; i <= j ; i++) {
                System.out.print(s[i][a]+" ");
                count++;
            }

            for (i = a+1; i <= k; i++) {
                System.out.print(s[k][i] +" ");
                count++;
            }

            for (i =j;i>=a; i--) {
                System.out.print(s[i][j]+" ");
                count++;
            }
            for (i = k-1;i>a;i--){
                System.out.print(s[a][i]+" ");
                count++;
            }
            if(count == m*n){
                break;
            }
            a++;
            j--;
            n--;

        }



    }
}
