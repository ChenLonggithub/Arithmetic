package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Vector;

public class A {

    public static void main(String[] args) {

        System.out.println(f(11,13));
    }

    public static int f(int n, int m)
    {
        n = n % m;
        Vector v = new Vector();

        for(;;)
        {
            v.add(n);
            n *= 10;
            n = n % m;
            if(n==0) return 0;
            if(v.indexOf(n)>=0) {//  __f(n-1,m)_______________________________ ;  //填空
                return v.size();
            }
        }
    }
}
