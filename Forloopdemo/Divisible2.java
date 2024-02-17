package Forloopdemo;

public class Divisible2 {
    // requirement 1 - 100 //
    // print the number divisible by 2 // 2 4 6 8 ....98, 100

    public static void main(String[] args) {
        // for(int i = 0;i<=100;i++){
        // //2 3 4 5
        // if(i%2 == 0){
        // System.out.println(i);
        // }
        // }

        // for(int i =0;i<=100;i++){
        // if(i%3==0){
        // System.out.println(i);
        // }
        // }

        // eg 6 12 18 24 1 - 100

        // using nexted if method
        // for (int i = 0; i < 101; i++) {
        // if (i%2==0) {
        // if(i%3==0){
        // System.out.println(i);
        // }
        // }
        // }

        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0 && i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
            }
        }

    }

}
