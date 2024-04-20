package Controlflow;

import java.util.Scanner;

public class Elseifladder {

    public static void main(String[] args) {

        Scanner kuchbhi = new Scanner(System.in);
        System.out.println("Enter the marks to check grades : ");
        int marks = kuchbhi.nextInt();

        if (marks >= 90 && marks < 100) {
            System.out.println("A");
        } else if (marks >= 60 && marks < 90) {
            System.out.println("B");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("C");
        } else if (marks >= 40 && marks < 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }

}