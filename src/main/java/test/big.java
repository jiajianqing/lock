package test;

public class big {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int min = a > b ? b : a;
        int result = 0;
        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % 2 == 0) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }


}
