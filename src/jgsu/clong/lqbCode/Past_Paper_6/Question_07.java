package jgsu.clong.lqbCode.Past_Paper_6;

/**
 * 小明被劫持到X赌城，被迫与其他3人玩牌。
 * 一副扑克牌（去掉大小王牌，共52张），均匀发给4个人，每个人13张。
 * 这时，小明脑子里突然冒出一个问题：
 * 如果不考虑花色，只考虑点数，也不考虑自己得到的牌的先后顺序，自己手里能拿到的初始牌型组合一共有多少种呢？
 */
public class Question_07 {
    static int sum = 0; // 记录手中的牌的数目
    static int ans = 0; // 记录结果

    private static void cal(int n) {
        if (sum > 13) return;
        if (n == 14) { // 13种牌型以及全部搜索
            if (sum == 13) {
                ans++;
                return;
            }
        } else {
            for (int i = 0; i < 5; i++) {
                sum += i;
                cal(n + 1);
                sum -= i; // 还原
            }
        }
    }

    public static void main(String[] args) {
        cal(1); // 从第一个牌搜索
        System.out.println(ans);
    }
}
