package jgsu.clong.lqbCode.ArithmeticTrain;

import java.util.*;

/**
 * 运算集合，给出两个整数集合A、B，求出他们的交集、并集以及B在A中的余集
 */
public class 集合运算 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        List<String> list1 =new  LinkedList();
        List<String> list2 = new LinkedList<>();
        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
            list1.add(sc.next());
        }
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            //B[i] = sc.nextInt();
            list2.add(sc.next());
        }

//        jiao(A,B);
//        bin(A,B);
//        yu(A,B);
        jiao(list1,list2);
        bin(list1,list2);
        yu(list1,list2);

    }

    //并集
    //list1.addAll(list2);
    //交集
    //list1.retainAll(list2);
    //差集
    //list1.removeAll(list2);

    private static void jiao(List<String> list1, List<String> list2) {
        list1.retainAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.toArray()[i]+" ");
        }
        System.out.println();

    }
    private static void bin(List<String> list1, List<String> list2) {
        list1.removeAll(list2);
        list1.addAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.toArray()[i]+" ");
        }
        System.out.println();
    }
    private static void yu(List<String> list1, List<String> list2) {
        list1.removeAll(list2);
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.toArray()[i]+" ");
        }
    }

    private static void yu(int[] a, int[] b) {
    }

    private static void bin(int[] a, int[] b) {
    }

    private static void jiao(int[] a, int[] b) {
    }

//    1 2 3 4 5
//    1 2 3 4
/*    private static void yu(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    break;
                }else{
                    count++;
                }
            }
            if(count == b.length){
                System.out.print(a[i]+" ");
            }

        }
    }

    private static void bin(int[] a, int[] b) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            set.add(b[i]);
        }
        Object[] bin = set.toArray();//将set转为数组输出
        Arrays.sort(bin);
        for (int i = 0; i < set.size(); i++) {
            System.out.print(bin[i]+" ");
        }
        System.out.println();//换行
    }

    private static void jiao(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    System.out.print(a[i]+" ");
                }
            }

        }
        System.out.println();//换行
    }*/
}
