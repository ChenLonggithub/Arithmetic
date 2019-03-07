package jgsu.clong.recursion;

public class IsEqualsString {

    public static void main(String[] args) {
        System.out.println(f("abcd","abcd"));
    }

    private static boolean f(String s1 , String s2) {
        if (s1.length() != s2.length()) return false;
        if(s1.length() == 0) return true;

        if(s1.charAt(0) != s2.charAt(0)) return false;

        return f(s1.substring(1),s2.substring(1));
    }
}
