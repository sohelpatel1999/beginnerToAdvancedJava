package String;

public class Stringtoogleproblem {
    public static void main(String[] args) {
        char[] arr = { 'S', 'O', 'h', 'E', 'L', 'n', 'e', 'E', 'l' };

        for (int i = 0; i < arr.length; i++) { // s == 51
            if (arr[i] >= 65 && arr[i] <= 90) {
                // arr[i] = (char) (arr[i] + 32);
                System.out.println((char) (arr[i] + 32));
            }
            if (arr[i] >= 97 && arr[i] <= 122) {
                // arr[i] = (char) (arr[i] - 32);
                System.out.println((char) (arr[i] - 32));
            }
        }
    }
}
