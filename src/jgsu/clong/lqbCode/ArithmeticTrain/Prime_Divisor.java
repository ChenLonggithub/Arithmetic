package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 　给定一个正整数n，求一个正整数p，满足p仅包含n的所有素因子，且每个素因子的次数不大于1
 */
public class Prime_Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        //定义一个数组来存放无重复的质因子
        List<Integer> list = new ArrayList<>();
        int r = 1;
        for (int i = 2; i < n; i++) {
            //对 n 进行质因子查询
            if(n%i == 0){
                list.add(i); //查到的质因子放到List中
                n = n / i;
                while (n%i == 0){  //去重操作，因为i在上面已经放到list中了，如果再放入
                                    //会重复，所以这里一直进行取余判断
                    n = n /i;
                }
            }
            if(n < i){            //当 i 大于 n ，说明已经查询结束，没有质因子了
                break;
            }
        }
        list.add((int) n);
        for(int sum:list){
            r = r*sum;
        }
        System.out.println(r);
    }

}
