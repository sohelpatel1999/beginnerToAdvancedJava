package Method;

public class Example2 {
    public static void main(String[] args) {

        int factanswer = neelfactorial(0);
        System.out.println(factanswer);

    }

    // 5! = 5 * 4 * 3 * 2 * 1;
    public static int neelfactorial(int sohel) {

        //edge case
        if(sohel == 0){
            return 0;
        }
        int answer = 1; // 120
        for (int i = sohel; i >= 1; i--) {
            answer = answer * i; // 5 * 4 * 3 * 2 * 1
        }
        return answer;
    }
}
