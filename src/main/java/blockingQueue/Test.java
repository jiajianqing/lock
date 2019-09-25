package blockingQueue;

import java.util.List;

public class Test {
    List list = new java.util.ArrayList<>();
    public void test(){
        synchronized (list){
            list.add(String.valueOf(System.currentTimeMillis()));
        }
    }
}
