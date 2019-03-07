package jgsu.clong.recursion;

public class ArraySumRec {

    public static int f(int[] a, int begin){

        if(begin==a.length) return 0;
        int x = f(a,begin+1);
        return x+a[begin];
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};

        int x = f(a,0);

        System.out.println(x);
    }
}
