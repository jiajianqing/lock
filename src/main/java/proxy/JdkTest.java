package proxy;

public class JdkTest {
    public static void main(String[] args) {
        ProxySaler proxySaler=new ProxySaler();
        Person object= (Person) proxySaler.newInstall(new zhangsan("张三","海淀区"));
        object.buy1();
        object.buy();
    }
}
