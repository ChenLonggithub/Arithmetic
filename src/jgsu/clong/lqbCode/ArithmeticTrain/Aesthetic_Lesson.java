package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;

/**
 * 课上有n位学生，帅老师展示了m幅画，其中有些是梵高的作品，另外的都出自五岁小朋友之手。
 * 老师请同学们分辨哪些画的作者是梵高，但是老师自己并没有答案，因为这些画看上去都像是
 * 小朋友画的……老师只想知道，有多少对同学给出的答案完全相反，这样他就可以用这个数据去
 * 揭穿披着皇帝新衣的抽象艺术了（支持帅老师^_^）。
 * 　　答案完全相反是指对每一幅画的判断都相反。
 *
 * 样例输入
 * 3 2
 * 1 0
 * 0 1
 * 1 0
 * 样例输出
 * 2
 */
public class Aesthetic_Lesson {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//学生数量
        int m = sc.nextInt();//图画的数量

        int[][] arr = new int[n][m];

        //获取学生的判断放入数组中
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        int cc= f(n,m,arr,sum);

        System.out.println(cc);

    }

   private static int f(int n, int m, int[][] arr, int sum) {

        //本使用暴力破解，三次循环
       for (int i = 0; i < n; i++) {

         int t = 1;
           while( t+i < n){
               //用来本组是否与其他组相反
               boolean is_no = true;
               for(int j = 0;j<m;j++){
                   if(arr[i][j] != arr[t+i][j]){
                       continue;
                   }else{
                       is_no = false;
                       break;
                   }
               }
               //如果相反+1
               if(is_no){
                   sum++;
               }
               t++;
           }

       }

        return sum;
    }
}
