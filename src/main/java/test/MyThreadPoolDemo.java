package test;

import java.util.concurrent.*;

public class MyThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService threadPool = new ThreadPoolExecutor(
                2,
                5,
                3L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
                new ThreadPoolExecutor.DiscardPolicy()
        );


        try {
            for (int i = 1; i <= 9; i++) {
                threadPool.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t号业务员提供服务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool.shutdown();
        }
    }

    private static void test() {
        //1.一池N线程       银行网点3个窗口
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
        //2.一池一线程      银行网点1个窗口
        ExecutorService threadPool2 = Executors.newSingleThreadExecutor();
        //3.可扩展线程池    银行网点1个窗口
        ExecutorService threadPool3 = Executors.newCachedThreadPool();

        try {
            for (int i = 1; i <= 20; i++) {
                threadPool3.execute(() -> {
                    System.out.println(Thread.currentThread().getName() + "\t号业务员提供服务");
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            threadPool3.shutdown();
        }
    }
}
