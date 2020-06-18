package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class list {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(2) {{
            add("1");
            add("2");
        }};

        Map<String, Object> map = new HashMap<String, Object>(2) {{
            put("key1", "obj1");
            put("key2", "obj2");
        }};

//        for (
//                int i = 0;
//                i < 10; i++) {
//            for (int j = 0; j < 9999; j++) {
//            }
//        }
//
//        //双重for循环
//        long oneStart = System.nanoTime();
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 100000; j++) {
//            }
//        }
//        System.out.println("外小内大:" + (System.nanoTime() - oneStart));
//
//        long twoStart = System.nanoTime();
//        for (int i = 0; i < 100000; i++) {
//            for (int j = 0; j < 10; j++) {
//
//            }
//        }
//        System.out.println("外大内小:" + (System.nanoTime() - twoStart));

        //解释:实参传递给形参的是值  形参和实参在内存上是两个独立的变量 对形参做任何修改不会影响实参
//        int b =20;
//        change(b);// 实参  实际上的参数
//        System.out.println(b);


        //实参传递给形参的是参数对于 堆内存上的引用地址 实参和 形参在内存上指向了同一块区域  对形参的修改会影响实参
        int [] a={1,2,3};
        System.out.println(a[0]);
        change(a);// 实参  实际上的参数
        System.out.println(a[0]);

    }

//    public static void change(int a){//形参  形式上的参数
//        a=100;
//    }

    public static void change(int[] a ){//形参  形式上的参数
        a[0]=100;
    }


}
