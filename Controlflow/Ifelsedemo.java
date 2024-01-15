package Controlflow;

public class Ifelsedemo {
    public static void main(String[] args) {

        int num = 99;

        int ans = num % 2;  //98 + 1 9=  8+ 1
        System.out.println("Answer is " + ans);


        if (ans == 1) {
            System.out.println(" number is odd");
        } else {
            System.out.println(" number is even");
        }

        // int a = 10;
        // int b = 20;

        // String answer = (num % 2 == 0) ? "number is even" : "number is odd";
        // System.out.println(answer);

    }
}
