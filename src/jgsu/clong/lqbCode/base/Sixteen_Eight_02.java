package jgsu.clong.lqbCode.base;

import java.util.Scanner;

public class Sixteen_Eight_02 {
    public static void main(String[] args) {
        new Sixteen_Eight_02().systemScanner();
    }
    public void systemScanner() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int length = sc.nextInt();
            for (int i = 0; i < length; i++){
                String strTmp=sc.next();
                tranform(strTmp.toCharArray(), strTmp.length());
            }
        }
    }
    /*
     * 3位16进制等价于4位8进制
     */
    int[] stack=new int[40000];

    public void tranform(char[] str, int length) {
        char[] buff = new char[4];
        int top = -1;
        for (int i = length - 1; i >= 0; i -= 3) {
            int sum = 0;
            for (int j = 0; j < 3 && i - j >= 0; j++) {// i-j>=0防止不够三个的情况
                int tmp = str[i - j] >= '0' && str[i - j] <= '9' ? str[i - j] - '0'
                        : str[i - j] - 'A' + 10;//区分是数字，还是字符，进行对应转换
                sum+=(tmp<<(4*j));//这句很重要，通过这句就可以从16变成10进制了，不过，不知道为什么？
                                  //是如何得出的呢？而且进行累加之后就能得到最终的结果很神奇
            }
            stack[++top]=sum;//sum的结果是16进制转化10进制的结果，每3个16进制变成10进制，再变8进制
        }
        while(stack[top]==0){//排除前导为0的判断
            top--;
        }
//      for(int i=top;i>=0;i--){//直接输出会丢失前导0，因为此转化成8进制并不是最左边的情况，应该保留0
//          System.out.print(Integer.toOctalString(stack[i]));//从10进制转化成8进制
//      }
        for(int i=top;i>=0;i--){
            String str1=Integer.toOctalString(stack[i]);//从10进制转化成8进制
            if(i!=top&&str1.length()<4){
                //不是最左边的一个，就不用去掉前导0,而默认是去掉0的，所以要进行补会
                for(int y=0;y<4-str1.length();y++)
                    System.out.print("0");
            }
            System.out.print(str1);
        }
        System.out.println();
    }
}
