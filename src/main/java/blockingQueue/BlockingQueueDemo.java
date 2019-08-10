package blockingQueue;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueDemo {
    public static void main(String[] args) {
//        List list = null;
//        System.out.println(Integer.MAX_VALUE);

        //region 1.BlockingQueue  add 抛出异常 队列满/空
//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        System.out.println(blockingQueue.add("a"));
//        System.out.println(blockingQueue.add("b"));
//        System.out.println(blockingQueue.add("c"));
//
//        // 对首元素
//        System.out.println(blockingQueue.element());
//
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
//        System.out.println(blockingQueue.remove());
        //endregion

        //region 2.BlockingQueue  offer 抛出异常 队列满/空
//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        System.out.println(blockingQueue.offer("a"));
//        System.out.println(blockingQueue.offer("a"));
//        System.out.println(blockingQueue.offer("a"));
//        System.out.println(blockingQueue.offer("a"));
//
//        // 对首元素
//        System.out.println(blockingQueue.peek());
//
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
//        System.out.println(blockingQueue.poll());
        //endregion

        //region 3.BlockingQueue  put 抛出异常 队列满/空
//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        System.out.println(blockingQueue.put("a"));
//        System.out.println(blockingQueue.put("a"));
//        System.out.println(blockingQueue.put("a"));
//        System.out.println("===========================");
//
//        System.out.println(blockingQueue.take());
//        System.out.println(blockingQueue.take());
//        System.out.println(blockingQueue.take());
//        System.out.println(blockingQueue.take());
        //endregion

        //region 4.BlockingQueue  offer超时 抛出异常

//        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(3);
//        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
//        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
//        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));
//        System.out.println(blockingQueue.offer("a",2L, TimeUnit.SECONDS));

        //endregion





    }
}
