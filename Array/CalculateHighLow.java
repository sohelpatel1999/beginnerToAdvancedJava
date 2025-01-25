public class CalculateHighLow {
    public static void main(String[] args) {
        System.out.println("hello");

        int[] neel = { 3, 2, 1, 5, 6, 4, 7, 3, 12 };

        int low = neel[0]; // 12
        int high = neel[0]; // 12
        System.out.println(low);
        for (int i = 0; i < neel.length; i++) { // i++ = 8
            if (high < neel[i]) { // 6 < 12 = true
                high = neel[i]; // high = 12
            }
            if (low > neel[i]) { // 1 > 5 false
                low = neel[i]; // low = 1 will assign low value to low variable
            }
        }

        for (int i = 0; i < neel.length; i++) {

        }

        System.out.println(low);
        System.out.println(high);

    }
}
