package Controlflow;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number to check the day: ");
        int mark = sc.nextInt();
        String day;

        switch (mark) {
            case 1:
                day = "Monday";
                System.out.println("A");
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid";
        }

        System.out.println("The number you enter is " + day);

    }
}
