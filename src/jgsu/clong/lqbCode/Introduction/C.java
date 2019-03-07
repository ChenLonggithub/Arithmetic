package jgsu.clong.lqbCode.Introduction;

public class C {
    public static void main(String[] args) {

        System.out.println(f(15,40));
    }

    //最大公约数
    private static int f(int i, int i1) {
        if(i==0) return i1;
        return f(i1%i,i);
    }
    //最小公倍数 a*b/f(a,b);
}
