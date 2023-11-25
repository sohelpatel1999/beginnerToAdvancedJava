package InputDemo;

import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        String name = sc.next(); //sohel is good boy
        sc.nextLine(); 
        String name1 = sc.nextLine(); 

        System.out.println("using only next " + number);
        System.out.println("using only next " + name);
        

        System.out.println("number we enter is " + name1);
    }
}
