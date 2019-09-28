package proxy;

public class zhangsan implements Person {
    private String name;
    private String house;

    public zhangsan(String name,String house){
        this.name = name;
        this.house = house;
    }
    @Override
    public void buy() {
        System.out.println(name + "买了" + house);

    }

    @Override
    public void buy1() {
        System.out.println("我最美");

    }
}
