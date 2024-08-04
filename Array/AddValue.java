import java.util.Scanner;

public class AddValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value at index " + i);
            arr[i] = sc.nextInt();

        }

        System.out.println(" length of array is " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println("value at index " + i + " is " + arr[i]);
        }

    }
}
