package pattern;

import java.util.Scanner;

public class Excercise1_SingleRow {
    public static void main(String[] args) {
        // taking user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to print star");
        int userNumber = sc.nextInt();

        // printing star logic
        for (int i = 1; i <= userNumber; i++) {
            System.out.print("* ");
        }
    }
}
