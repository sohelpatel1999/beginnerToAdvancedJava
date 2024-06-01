
package revision;

import java.util.Scanner;

public class Excercise3bignumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a > c) {
            System.out.println(a + "block A");
        } else if (b >= a && b > c) {
            System.out.println(b + "block B");
        } else {
            System.out.println(c + "block C");
        }

    }

}
