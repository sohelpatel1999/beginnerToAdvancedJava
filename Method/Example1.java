package Method;

public class Example1 {

    public static void main(String[] args) {

        int answer = square(5);
        int answer1 = square();
        System.out.println(answer1);
       

    }

    public static int square(int num) {
        int answer = num * num;
        System.out.println(answer + " is the square of " + num);
        return answer;
    }

    public static int square() {  
        return 100000;
    }

}
