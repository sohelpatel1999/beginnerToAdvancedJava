package Method;

public class Example2 {
    public static void main(String[] args) {

        int factof5 = neelfactorial(5);
        int factanswer2 = neelfactorial(6);
        int factanswer3 = neelfactorial(7);
        int factanswer4 = neelfactorial(8);
        int factanswer5 = neelfactorial(9);
        int factanswer6 = neelfactorial(10);

        System.out.println("the fact of 5 is " + neelfactorial(5));
        System.out.println("the fact of 6 is " + neelfactorial(6));
        System.out.println("the fact of 7 is " + neelfactorial(7));
        System.out.println("the fact of 8 is " + neelfactorial(8));
        System.out.println("the fact of 9 is " + neelfactorial(9));

        // System.out.println(factanswer);

        // int num = 5;
        // int sum = 1;
        // for(int i = 1;i<=num;i++){
        // sum = sum * i;
        // }
        // System.out.println(sum);
        // int num2 = 10;
        // int sum2 = 1;
        // for(int i = 1;i<=num2;i++){
        // sum2 = sum2 *i;
        // }
        // System.out.println("the value of sum 2 "+ sum2);
    }

    // 5! = 5 * 4 * 3 * 2 * 1;
    public static int neelfactorial(int sohel) {

        // edge case
        if (sohel == 0) {
            return 0;
        }
        int answer = 1; // 120
        for (int i = sohel; i >= 1; i--) {
            answer = answer * i; // 5 * 4 * 3 * 2 * 1
        }
        return answer;
    }
}
