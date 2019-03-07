package jgsu.clong.lqbCode.ArithmeticTrain;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * ① 使用Reader来读取字符流，可以防止读取比较大的数字的时候超时
 * <p>
 * ② 使用HashMap来记录出现的二进制对应的十进制字符串出现的次数，方便以后进行相乘的计算
 * <p>
 * 假如当前没有出现过的数字，把当前数字放入到HashMap中，并且将它的值置为1，发现之前出现过，那么把之前数字的值加1
 * <p>
 * ③ 遍历HashMap，需要注意的是由于是二进制的异或操作，所以只需要m位二进制数字全为1的的一般即可，
 * 意思是例如当三位二进制对应的十进制数字为7，二进制对应的数字为111的时候，那么只需要计算最大值的一半即可，
 * 即7的一半3（000~011）：maxn / 2之前的二进制数字与maxn异或之后的结果在maxn / 2之后，maxn / 2之后的二进制数字
 * 与maxn异或之后的结果在maxn / 2之前，假如计算max / 2范围内HashMap内保存的全部数字会造成重复计算，所以只需要计算maxn / 2即可
 * <p>
 * 把HashMap中getKey()的值与maxn进行异或，假如HashMap中存在这样的值，把HashMap相反结果的次数乘起来就是当前二进制数字对应的相反的次数
 */
public class Aesthetic_Lesson_03 {
    //定义一个静态的Reader，是输入读取的更快
    private static Reader reader;

    public static void main(String[] args) {
        reader = new InputStreamReader(System.in);
        int n, m;
        n = getInt();
        m = getInt();
        //HashMap来记录出现的二进制对应的十进制字符串出现的次数，方便以后进行相乘的计算
        HashMap<Integer, Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; ++i) {
            int num = 0, x = 0;
            for (int j = 0; j < m; j++) {
                x = getInt();
                num = (num << 1) + x;
            }
            map.put(num, map.containsKey(num) ? map.get(num) + 1 : 1);
        }
        int sum = 0, maxn = (1 << m) - 1;
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            //除以二是因为不要重复计算其中的值
            //因为max / 2之前的key异或之后与max / 2之后异或的值与之前是一样的,所以要除以二
            if (maxn / 2 < entry.getKey())
                continue;
            int key = entry.getKey() ^ maxn;
            //进行异或的目的是为了查找对应的值与之相反的key对应的值
            if (map.containsKey(key)) {
                //相乘表示两者完全相反的次数
                sum += map.get(key) * entry.getValue();
            }
        }
        System.out.println(sum);
    }

    public static int getInt() {
        int res = 0, read;
        try {
            while ((read = reader.read()) != -1) {
                if (Character.isDigit(read)) {// 因为全是非负数，不需要判断负号‘-’,只要是数字就行
                    res = read - '0';
                    while ((read = reader.read()) != -1) {// 继续得到能得到的数字
                        if (Character.isDigit(read)) {
                            res = res * 10 + (read - '0');
                        } else {
                            break;
                        }
                    }
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
