package Operators.Mixed;

public class Excercise1 {

    // step 1 result of arithmetic operation
    // step 2 result should be even
    // step 3 result should be greater than 10

    public static void main(String[] args) {
        int result = (8*3)+(5-2)*(8*3)+(5-2);
        System.out.println(result);

        // Step 2 
        // 10 = true     10 % 2 = 0      0 == 0 true
        // 13 = false    13 % 2 = 1      1 == 0   false
        // num % 2 == 0  formula to check even and or 

        boolean isEven = result % 2 == 0;
        System.out.println(isEven);

        boolean answer = isEven && (result>10);
        System.out.println(answer);

        System.out.println((result%2==0) && (result>10)); //one line code

        
    }

}
