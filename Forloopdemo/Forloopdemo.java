package Forloopdemo;
import java.util.Scanner;

public class Forloopdemo {

    public static void main(String[] args) {
        
        // for(initilization ; condition ; increment decrement)
        // for (int i = 0; i < num; i++) {
            
        // }


        Scanner sc = new Scanner(System.in);

        // System.out.println("Hello");
        System.out.println("Enter the Number for tables");
        int number = sc.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + (number * i));

        }

        System.out.println("done");

    }
}
