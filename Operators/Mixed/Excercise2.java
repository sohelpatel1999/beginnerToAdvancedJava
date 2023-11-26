package Operators.Mixed;

// Question 2: Range Check with Logical OR
// Description: Write a Java expression that evaluates to true if a given number is either less than 20 or greater than 50.
// Explanation: This question involves a range check using the < (less than) and > (greater than) relational operators. The logical OR (||) operator is used to combine two conditions.


public class Excercise2 {
    public static void main(String[] args) {
        int num =25;
        boolean sohel = num<20 || num>50;
        System.out.println(sohel);
    }
}
