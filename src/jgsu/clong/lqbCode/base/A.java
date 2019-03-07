package jgsu.clong.lqbCode.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A {
    public static void main(String[] args) {
        /*int a = 10;
        System.out.println(14+'A'-10);

        System.out.println(""+1+2);
        System.out.println(3*3*3+7*7*7);*/
        //System.out.println(Math.pow(2,3));
       //System.out.println(1<<1);

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(1);
        list.add(15);
        list.add(31);
        list.add(11);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });


        System.out.println(list);


    }
}
