package Controlflow;

public class Ifelsedemo {
    public static void main(String[] args) {

        int num = 11;

        if (num % 2 == 0) {
            System.out.println(" number is even");
        } else {
            System.out.println(" number is odd");
        }

        // int a = 10;
        // int b = 20;

        String answer = (num % 2 == 0) ? "number is even" : "number is odd";
        System.out.println(answer);

    }
}
