import java.util.Scanner;

public class Fibo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int digit = sc.nextInt();
        int answer = fibo(digit);
        System.out.println(answer);

    }

    // fibo 0 = 0, 1 = 1, 2 =1, 3 = 2, 4 = 3 , 5 = 5.
    public static int fibo(int num) {

        if(num == 0 || num == 1){
            return num;
        }

        int num0 = 0; //1 // 1
        int num1 = 1; //1 //2
        int answer = 0;
        for (int i = 2; i <= num; i++) {
            answer = num0 + num1;
            num0 = num1;
            num1 = answer;
        }
        return answer;
       

    }
}
