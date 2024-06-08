package pattern;

import java.util.Scanner;

public class Excercise2_SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print star");
        int userNumber = sc.nextInt();

        for (int i = 1; i <= userNumber; i++) {

            for (int j = 1; j <= userNumber; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }
}
