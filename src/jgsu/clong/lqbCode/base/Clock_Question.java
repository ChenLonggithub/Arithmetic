package jgsu.clong.lqbCode.base;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 时间用时h和分m表示，在英文的读法中，读一个时间的方法是：
 * 　　如果m为0，则将时读出来，然后加上“o'clock”，如3:00读作“three o'clock”。
 * 　　如果m不为0，则将时读出来，然后将分读出来，如5:30读作“five thirty”。
 * 　　时和分的读法使用的是英文数字的读法，其中0~20读作：
 * 　　0:zero, 1: one, 2:two, 3:three, 4:four, 5:five, 6:six, 7:seven, 8:eight, 9:nine, 10:ten, 11:eleven,
 *     12:twelve, 13:thirteen, 14:fourteen, 15:fifteen, 16:sixteen, 17:seventeen, 18:eighteen, 19:nineteen, 20:twenty。
 * 　　30读作thirty，40读作forty，50读作fifty。
 * 　　对于大于20小于60的数字，首先读整十的数，然后再加上个位数。如31首先读30再加1的读法，读作“thirty one”。
 * 　　按上面的规则21:54读作“twenty one fifty four”，9:07读作“nine seven”，0:15读作“zero fifteen”。
 */
public class Clock_Question {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        String[] hh = {"zero","one","two","three","four","five","six","seven","eight","nine",
                "ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
                "nineteen","twenty","twenty one","twenty two","twenty three","zero"};

        //30读作thirty，40读作forty，50读作fifty。
        Map<Integer,String> map = new HashMap<>();
        map.put(10,"ten");
        map.put(20,"twenty");
        map.put(30,"thirty");
        map.put(40,"forty");
        map.put(50,"fifty");

        if(m == 0 && h == 0){
            System.out.println("zero o'clock");
        }else{
            if(m == 0){
                System.out.println(hh[h]+" o'clock");
            }
            if(m>20){
                int m1 = (m/10)*10;
                int m2 = m%10;

                if(m2 == 0){
                    System.out.println(hh[h] +" "+map.get(m1));
                }else{
                    System.out.println(hh[h] +" "+map.get(m1)+" "+hh[m2]);
                }
            } else{
                System.out.println(hh[h] +" "+hh[m]);
            }
        }



    }
}
