public class PrintArray {
    public static void main(String[] args) {

        int[] arr = new int[100];
        arr[0] = 45;
        arr[1] = 46;
        arr[2] = 47;
        arr[3] = 12;
        arr[4] = 22;

        //type 1 manually
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // starting value = 0 end value arr.lenth - 1 type 2 simple
        for (int i = 0; i < 3; i++) {   //O(n)      (O(1) or constatnt)
            System.out.println(arr[i]);
        }

        // System.out.println(arr[2]);

    }
}
