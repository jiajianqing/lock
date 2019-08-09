package test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    public static void main(String[] args) {

        Test printTest1 = new Test();

        new Thread((() -> {
            printTest1.printA_Z();
        }), "打印A-Z线程").start();

        new Thread((() -> {
            printTest1.print1_52();
        }), "打印1-52线程").start();

    }


    private static int num = 1;
    public final Lock lock = new ReentrantLock();

    public final Condition printA_ZCondition = lock.newCondition();
    public final Condition print1_52Condition = lock.newCondition();

    //打印数字的方法
    public void print1_52() {
        lock.lock();
        try {
            for (int i = 1; i < 53; i++) {
                while (num%3==0){
                    try {
                        print1_52Condition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"=====>"+i);
                num++;
                printA_ZCondition.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    //打印字母的方法
    public void printA_Z() {
        lock.lock();
        try {
            for (char i = 'A'; i <= 'Z'; i++) {
                //打印字母的方法
                while (num%3!=0){
                    try {
                        printA_ZCondition.await();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName()+"=====+>"+i);
                //改条件,唤醒下一个线程
                num++;
                print1_52Condition.signal();

            }
        } finally {
            lock.unlock();
        }
    }
}
