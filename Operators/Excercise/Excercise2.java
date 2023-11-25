package Operators.Excercise;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        // pie R square
        double areaOfCircle = Math.PI * radius * radius;

        System.out.println(" the are of circle is " + areaOfCircle);

    }
}
