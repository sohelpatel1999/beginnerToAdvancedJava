package Operators.Excercise;

import java.util.Scanner;

public class Excercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println("the farenit is " + input);


        //°C = (°F - 32) × 5/9

        float celcius = (input - 32) * 5/9;

        System.out.println(" the celcius is " + celcius);
    }

}
