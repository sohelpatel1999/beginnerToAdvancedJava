public class factorialdemo {

    public static void main(String[] args) {
        int N = 53;
        int answer = FactorialCount(N);
        System.out.println(answer);

    }

    public static int FactorialCount(int number) {

        int count = 0;

        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i == number / i) {
                    count = count + 1;
                } else {
                    count = count + 2;
                }
            }
        }

        return count;

    }

}
