package jgsu.clong.lqbCode.Past_Paper_6;

/**
 * 观察下面的加法算式：
 * <p>
 * 祥 瑞 生 辉
 * +   三 羊 献 瑞
 * -------------------
 * 三 羊 生 瑞 气
 * <p>
 * (如果有对齐问题，可以参看【图1.jpg】)
 * <p>
 * 其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
 * 请你填写“三羊献瑞”所代表的4位数字（答案唯一），不要填写任何多余内容。
 */
public class Question_03 {

    // *      9 9 9 9
    // *   +  1 0 0 9
    // * -------------------
    // *    1 0 0 0 8

    private static int[] visited = new int[10];
    private static int[] a = new int[10];
    private static int ans = 0;


    public static void dfs(int step) {
        if (step > 7) {
            if (((a[0] * 1000 + a[1] * 100 + a[2] * 10 + a[3])
                    + (a[4] * 1000 + a[5] * 100 + a[6] * 10 + a[1]) == (a[4]
                    * 10000 + a[5] * 1000 + a[2] * 100 + a[1] * 10 + a[7])) && a[0] != 0 && a[4] != 0) {
                System.out.println(a[4] + "" + a[5] + "" + a[6] + "" + a[1]);
                ans++;
            }
            return;
        }
        for (int i = 0; i <= 9; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                a[step] = i;
                dfs(step + 1);
                visited[i] = 0;
            }

        }
    }

    public static void main(String[] args) {
        //dfs(0);
        // System.out.println(ans);
        int a, b, c, d, f, g, h;
        int numOne, numTwo, sum;
        for (a = 2; a <= 9; a++) {
            for (b = 0; b <= 9; b++) {
                for (c = 0; c <= 9; c++) {
                    for (d = 0; d <= 9; d++) {
                        for (f = 0; f <= 9; f++) {
                            for (g = 0; g <= 9; g++) {
                                for (h = 0; h <= 9; h++) {
                                    if (a != b && a != c && a != d && a != f && a != g && a != h
                                            && b != c && b != d && b != f && b != g && b != h
                                            && c != d && c != f && c != g && c != h
                                            && d != f && d != g && d != h
                                            && f != g && f != h
                                            && g != h
                                            && a != 1 && b != 1 && c != 1 && d != 1 && f != 1 && g != 1 && h != 1) {
                                        numOne = a * 1000 + b * 100 + c * 10 + d;
                                        numTwo = 1 * 1000 + f * 100 + g * 10 + b;
                                        sum = 1 * 10000 + f * 1000 + c * 100 + b * 10 + h;
                                        if (sum == (numOne + numTwo)) {
                                            System.out.println(1 + "" + f + g + b);
                                        }
                                    }

                                }

                            }
                        }
                    }
                }
            }
        }

    }

}
