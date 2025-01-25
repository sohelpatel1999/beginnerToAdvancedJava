public class Reverse {
    public static void main(String[] args) {
        System.out.println("hello");

        int[] arr = { 50, 40, 30, 20, 10 }; // {10,20,30,40,50}

        int sp = 0;
        int ep = arr.length - 1;

        while (sp < ep) {
            int temp = arr[sp];
            arr[sp] = arr[ep];
            arr[ep] = temp;
            sp++;
            ep--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
