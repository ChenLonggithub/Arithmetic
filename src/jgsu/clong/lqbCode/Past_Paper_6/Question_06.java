package jgsu.clong.lqbCode.Past_Paper_6;

/**
 *
 我们都知道：1+2+3+ ... + 49 = 1225
 现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015

 比如：
 1+2+3+...+10*11+12+...+27*28+29+...+49 = 2015
 就是符合要求的答案。

 请你寻找另外一个可能的答案，并把位置靠前的那个乘号左边的数字提交（对于示例，就是提交10）。
 */
public class Question_06 {
    public static void main(String[] args) {
        int [] a = new int[50];
        for (int i = 1; i <= 49; i++) {
            a[i] = i;
        }
        for (int i = 1; i < a.length-4 ; i++) {
            for (int j = i+3; j < a.length; j++) {
                if(j < a.length-1){
                    if(a[i]*a[i+1]+a[j]*a[j+1]+1225-a[i]-a[i+1]-a[j]-a[j+1] == 2015){
                        System.out.println(i+"--"+j);
                    }
                }
            }
        }
    }
}
