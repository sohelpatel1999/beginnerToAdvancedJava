package pattern;

import java.util.Scanner;

public class Excercise4_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int noSpace = N / 2; // 2
        int noStar = 1;
        System.out.println(noSpace);
        System.out.println(noStar);

        // outer loop for vertiacal
        for (int i = 1; i <= N; i++) { //

            // for loop to print space
            for (int j = 1; j <= noSpace; j++) { //
                System.out.print(" ");
            }

            // for loop to print star
            for (int j = 1; j <= noStar; j++) { //
                System.out.print("*");
            }

            // preparing for next iteration
            if (i <= N / 2) {
                noSpace--; //
                noStar = noStar + 2;
            } else {
                noSpace++; //
                noStar = noStar - 2;
            }

            // moving courser for another line
            System.out.println();

        }
    }
}
