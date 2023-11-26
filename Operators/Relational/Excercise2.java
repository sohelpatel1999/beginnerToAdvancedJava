package Operators.Relational;

import java.util.Scanner;


// Question 2: Range Check
// Write a Java expression that checks whether a given number (num) is in the range of 20 to 50 (inclusive). The expression should evaluate to true if the number is in the specified range; otherwise, it should evaluate to false.


public class Excercise2 {

    public static void main(String[] args) {

        // num = 12 (20 to 50) = false 
        // num>20

        // num = 30 (20 to 50) = true
        // num>20 && num<50 == true

        // num = 75 (20 to 50) = false
        // num>20 && num<50

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean answer = num>20 && num<50;

        System.out.println(answer);

        
    }
    
}
