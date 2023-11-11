package Operators;

public class Logical {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // and operator &&
        System.out.println(a < b && b < c); // 10 < 20 = true && 20 < 30 = true; true && true = true
        System.out.println(a < b && b > c); // 10 < 20 = true && 20 > 30 = false; true && false = false
        System.out.println(a > b && b < c); // 10 >20 = false && 20 < 30 = true ; false && true = false
        System.out.println(a > b && b > c); // 10 > 20 = false && 20 > 30 = false ; false && false = false

        // or operator ||
        System.out.println(a < b || b < c); // 10 < 20 = true || 20 < 30 = true; true && true = true
        System.out.println(a < b || b > c); // 10 < 20 = true || 20 > 30 = false; true && false = false
        System.out.println(a > b || b < c); // 10 >20 = false || 20 < 30 = true ; false && true = false
        System.out.println(a > b || b > c); // 10 > 20 = false || 20 > 30 = false ; false && false = false

    }
}
