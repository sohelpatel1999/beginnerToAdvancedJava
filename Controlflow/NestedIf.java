package Controlflow;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // age >= 18
        // citezenofUs is there or not

        int age = 21;
        boolean isUsCitezen = false;

        if (age >= 18) {
            System.out.println("your age is grether than 18");
            if (isUsCitezen) {
                System.out.println("You can vote");
            } else {
                System.out.println("you cannot vote you are of other country");
            }
        } else {
            System.out.println("your are less than 18 year");
        }


        

        // int a = 10;
        // int b = 20;

        // if (a == 100) {
        // System.out.println(" enter If block");
        // if (b % 2 == 0) {
        // System.out.println("b is even in if block");
        // } else {
        // System.out.println("b is odd in if block");
        // }
        // System.out.println(" Exit If block");
        // } else {
        // System.out.println("enter Else block");
        // if (b % 2 == 0) {
        // System.out.println("b is even in else block");
        // } else {
        // System.out.println("b is odd in else block");
        // }
        // System.out.println("Exit Else block");
        // }
    }
}
