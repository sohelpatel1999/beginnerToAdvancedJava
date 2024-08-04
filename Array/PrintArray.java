public class PrintArray {
    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 45;
        arr[1] = 46;
        arr[2] = 47;
        arr[3] = 12;
        arr[4] = 22;

        // System.out.println(arr[2]);
        for (int i = 0; i <= 4; i++) {
            System.out.println("value at index " + i + " is " + arr[i]);
        }

    }
}
