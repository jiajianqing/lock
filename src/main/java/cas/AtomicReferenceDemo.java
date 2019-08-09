package cas;


import java.util.concurrent.atomic.AtomicReference;

class User{
    String userName;
    int age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String z3, int i) {
    }
}
public class AtomicReferenceDemo {

    public static void main(String[] args) {
        User z3 = new User("z3",22);
        User li4 = new User("li4",25);


        AtomicReference<User> atomicReference = new AtomicReference<>();
        atomicReference.set(z3);

        System.out.println(atomicReference.compareAndSet(z3, li4) + "\t" + atomicReference.get().toString());
        System.out.println(atomicReference.compareAndSet(z3, li4) + "\t" + atomicReference.get().toString());
    }
}
