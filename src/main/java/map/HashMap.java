package map;


public class HashMap {

    public static void main(String[] args) {
        java.util.HashMap<Object, Object> map = new java.util.HashMap<>();
        map.put("sm", "少林寺三毛");
        map.put("gs", "冠生");
        map.put("monkey", "源码学院只为培养bat程序猿而生");
        System.out.println(map.get("sm"));
        System.out.println(map.get("gs"));
        System.out.println(map.get("monkey"));

        for (int i = 0; i < 10000; i++) {
            map.put("j" + i, "j" + i);
        }
        System.out.println(map);
    }
}
