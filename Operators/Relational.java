package Operators;

public class Relational {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        // Strictly Greater than
        System.out.println(a < b); // 10<20 = true.

        // Strictly lesser than
        System.out.println(a > b); // 10>20 = false.

        // greater than equal to
        System.out.println(a <= b); // 10 <=20 = true

        // lesser than equal to
        System.out.println(a >= b); // 10 >=20 = false

        // Strictly Equal to
        System.out.println(a == b); // 10 == 20 = false.

        // Not Equal to
        System.out.println(a != b); // 10 != 20 = true.

        System.out.println(a != c); // 10 != 10 = false.

    }

}
