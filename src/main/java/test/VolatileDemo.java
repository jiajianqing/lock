package test;

import java.util.concurrent.TimeUnit;

class MyData {
    volatile int number = 0;

    public void addTO60() {
        this.number = 60;
    }
}

public class VolatileDemo {

    public static void main(String[] args) {
        //资源类
        MyData myData = new MyData();

        // 第一个线程
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "\t come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            myData.addTO60();
            System.out.println(Thread.currentThread().getName() + "\t updated number value: " + myData.number);
        }, "AAA").start();


        //第二个线程就是我们的main线程
        while (myData.number == 0) {
            //main线程就一直在这里等待循环，直到number值不再等于零
        }
        System.out.println(Thread.currentThread().getName() + "\t mission is over");

    }
}


