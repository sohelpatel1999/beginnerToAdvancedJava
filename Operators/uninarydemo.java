package Operators;

import java.util.Scanner;

public class uninarydemo {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); //24
        System.out.println(age++);   //24 increment by 1 = 25
        System.out.println(age);     // 25

        System.out.println(age--);  //25 decrement by 1 = 24
        System.out.println(age); // 24

        System.out.println(++age); // 25
        System.out.println(age);   //25

        System.out.println(--age); //24
        System.out.println(age);  //24
    }
}
