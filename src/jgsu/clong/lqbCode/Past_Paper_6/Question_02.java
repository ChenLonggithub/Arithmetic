package jgsu.clong.lqbCode.Past_Paper_6;

/**
 * 观察下面的现象,某个数字的立方，按位累加仍然等于自身。
 * 1^3 = 1
 * 8^3  = 512    5+1+2=8
 * 17^3 = 4913   4+9+1+3=17
 * ...
 * <p>
 * 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？
 */
public class Question_02 {
    public static void main(String[] args) {
/*        int count=0;
        for(int i=1;i<100000;i++)
        {
            int num=(int) Math.pow(i,3);
            int temp=0;
            while(num!=0)
            {
                temp+=num%10;
                num/=10;
            }
            if(temp==i)
            {
                count++;
            }
        }
        System.out.println(count);*/


/*        int count = 0;
        for (int i = 1; i < 100; i++) {
            int x = i*i*i;
            String xs = String.valueOf(x);
            int n = xs.length();
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Integer.valueOf(xs.substring(j,j+1));
            }
            if(i == sum){
                System.out.println(i);
                count++;
            }

        }

        System.out.println(count);*/
    }
}
