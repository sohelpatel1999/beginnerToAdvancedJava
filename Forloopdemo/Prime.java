package Forloopdemo;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0; //1
        //7 , 24 , 14
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                count++;  //3 12
            }
        }
        if (count==2) {
            System.out.println("number is Prime");
        } else{
            System.out.println("number is not prime");
        }

    }
}
