package Operators.Relational;

// Question 1: Number Comparison
// Write a Java expression that compares two numbers (num1 and num2) and evaluates to true if num1 is greater than num2; otherwise, it should evaluate to false.


import java.util.Scanner;

public class Excercise1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1>num2);

    }
    
}
