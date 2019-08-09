package test;

import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

import java.sql.SQLOutput;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {

    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private int num = 1;
    private int num2 = 65;
    private int bj = 1;

    /**
     * 打印数字
     *
     * @return
     */
    public void printNum() {
        lock.lock();
        try {
            while (num % 3 == 0) {
                c1.await();
            }
            for (int i = 1; i <= 2; i++) {
                System.out.println(num);
                num++;
            }
            c2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void printNum2() {
        lock.lock();

        try {
            while (bj <= 4) {
                char num3 = (char) num2;
                System.out.println(num3);
                num3++;
            }

            c1.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        TestLock testLock = new TestLock();
        new Thread(() -> {
            for (int i = 1; i <= 4; i++) {
                testLock.printNum();
            }
        }).start();

        new Thread(() -> {
            testLock.printNum2();
        }).start();
    }
}
