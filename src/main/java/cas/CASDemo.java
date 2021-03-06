package cas;

import java.util.concurrent.atomic.AtomicInteger;

//CAS是什么？ 比较并交换
public class CASDemo {
    public static void main(String[] args){
        AtomicInteger atomicInteger = new AtomicInteger(5);

        System.out.println(atomicInteger.compareAndSet(5, 2019) + "\tt current data:" + atomicInteger.get());

        System.out.println(atomicInteger.compareAndSet(5, 1024) + "\tt current data:" + atomicInteger.get());

        atomicInteger.getAndIncrement();

    }
}
