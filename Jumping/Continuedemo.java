package Jumping;

public class Continuedemo {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {

            if (index == 5) {
                continue;
            }
            
            System.out.println(index + " After");

        }
    }
}
