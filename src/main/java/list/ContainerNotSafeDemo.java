package list;

import sun.plugin2.message.GetNameSpaceMessage;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * 集合类不安全的问题
 * ArrayList
 */
public class ContainerNotSafeDemo {
    public static void main(String[] args) {

//        new ArrayList<Integer>().add(1);

        //region 第一种方式 单线程

//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//
//        for (String element : list) {
//            System.out.println(element);
//        }
        //endregion

        //region 1.ArrayList情况
//        List<String> list = new ArrayList<>();
//        解决1 2 3
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
//        List<String> list = new  CopyOnWriteArrayList<>();


//         java.util.ConcurrentModificationException   出现并发修改异常
//        for (int i = 1; i <= 30; i++) {
//            new Thread(() -> {
//                list.add(UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(list);
//            }, String.valueOf(i)).start();
//        }
        //endregion

        //region 2.Map在高并发多线程下的一种不安全情况
//        Map<String,String> map = new HashMap<>();
//        Map<String,String> map = new ConcurrentHashMap<>();
//
//        for (int i = 1; i <= 30; i++) {
//            new Thread(() -> {
//                map.put(Thread.currentThread().getName(),UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(map);
//            }, String.valueOf(i)).start();
//        }
        //endregion

        //region 3.HashSet在高并发多线程下的一种不安全情况
//        Set<String> set = new HashSet<>();
//        Set<String> set = new CopyOnWriteArraySet<>();
//        for (int i = 1; i <= 30; i++) {
//            new Thread(() -> {
//                set.add(UUID.randomUUID().toString().substring(0, 8));
//                System.out.println(set);
//            }, String.valueOf(i)).start();
//        }
////
//        new HashSet<>().add("a");
        //endregion



        /**
         * 1.故障现象
         * java.util.ConcurrentModificationException
         *
         * 2.导致原因
         *
         *
         * 3.解决方案
         *  3.1 new Vector<>();
         *  3.2 Collections.synchronizedList(new ArrayList<>());
         *
         *
         * 4.优化建议（同样的错误不犯第2次）
         */


    }
}
