package jgsu.clong.lqbCode.base;

/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 *
 * 00000
 *
 * 00001
 *
 * 00010
 *
 * 00011
 *
 * 00100
 *
 * 请按从小到大的顺序输出这32种01串
 */
public class String_01 {
    public static void main(String[] args) {

        int i=0,c=0,x,z;
        System.out.printf("00000\n");
        for(i=1;i<32;i++)
        {
            int [] a={0,0,0,0,0,};
            x=i;

            while(x!=0) {
                z=x%2;
                a[c]=z;
                c++;
                x=x/2;
            }
            c=4;
            for(;c>=0;c--)
            {
                System.out.printf("%d",a[c]);
            }
            System.out.printf("\n");
            c=0;
        }
    }
}
