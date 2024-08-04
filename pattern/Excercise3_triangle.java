package pattern;

import java.util.Scanner;

public class Excercise3_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to Print triangle");
        int userInput = sc.nextInt();

        for (int i = 1; i <= userInput; i++) { 

            for (int j = 1; j <= i; j++) { // 13
                System.out.print("*  ");
            }
            System.out.println(); // 16
        }
    }
}
