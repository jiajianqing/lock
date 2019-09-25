package blockingQueue;

public class joinTest {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
//        ThreadJoinTest1 t1 = new ThreadJoinTest1("今天");
//        ThreadJoinTest1 t2 = new ThreadJoinTest1("明天");
//        ThreadJoinTest1 t3 = new ThreadJoinTest1("后天");
//        /*
//         * 通过join方法来确保t1、t2、t3的执行顺序
//         * */
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();

//        int x = 5*3;
//        int y=x+5/x+3;
//        System.out.println(y);



            for (int c = 101; c <= 200; c++) { // 先获得101到200的数
                boolean flag = true;
                for (int a = 2; a < c; a++) { // 获得到被除数，不能大于除数
                    if (c % a == 0) { // 如果余数为零
                        flag = false; // 舍弃
                        continue; // 返回上一层函数
                    }
                }
                if (flag) { // 符合要求打印在控制台
                    System.out.println(c);
                }
            }
    }
}
//class ThreadJoinTest1 extends Thread{
//    public ThreadJoinTest1(String name){
//        super(name);
//    }
//    @Override
//    public void run(){
//        for(int i=0;i<5;i++){
//            System.out.println(this.getName() + ":" + i);
//        }
//    }
//}
