package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.Scanner;
import java.util.Stack;

/**
 * 样例输入
 * <p>
 * 1-2+3*(4-5)
 * <p>
 * 样例输出
 * <p>
 * -4
 */
public class Expression_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> nums = new Stack<Integer>(); // 保存数字
        Stack<Character> opes = new Stack<Character>(); // 保存操作符
        String string = scanner.nextLine();
        int n = 0; // 保存每一个数字
        char[] cs = string.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char temp = cs[i];
            if (Character.isDigit(cs[i])) {
                n = 10 * n + Integer.parseInt(String.valueOf(cs[i])); // 大于10的数字保存
            } else {
                if (n != 0) {
                    nums.push(n);
                    n = 0;
                }
                if (temp == '(') {
                    opes.push(temp);
                } else if (temp == ')') {
                    while (opes.peek() != '(') { // 括号里面运算完
                        int t = cal(nums.pop(), nums.pop(), opes.pop());
                        nums.push(t);
                    }
                    opes.pop();
                } else if (isType(temp) > 0) {
                    if (opes.isEmpty()) { // 栈为空直接入栈
                        opes.push(temp);
                    } else {
                        // 若栈顶元素优先级大于或等于要入栈的元素,将栈顶元素弹出并计算,然后入栈
                        if (isType(opes.peek()) >= isType(temp)) {
                            int t = cal(nums.pop(), nums.pop(), opes.pop());
                            nums.push(t);
                        }
                        opes.push(temp);
                    }
                }
            }
        }
        // 最后一个字符若是数字,未入栈
        if (n != 0) {
            nums.push(n);
        }
        while (!opes.isEmpty()) {
            int t = cal(nums.pop(), nums.pop(), opes.pop());
            nums.push(t);
        }
        System.out.println(nums.pop());
    }

    // 返回的是运算符的优先级,数字和()不需要考虑
    public static int isType(char c) {
        if (c == '+' || c == '-') {
            return 1;
        } else if (c == '*' || c == '/') {
            return 2;
        } else {
            return 0;
        }
    }

    // 运算次序是反的,跟入栈出栈次序有关
    public static int cal(int m, int n, char c) {
        int sum = -987654321;
        if (c == '+') {
            sum = n + m;
        } else if (c == '-') {
            sum = n - m;
        } else if (c == '*') {
            sum = n * m;
        } else if (c == '/') {
            sum = n / m;
        }
        return sum;

    }

}
