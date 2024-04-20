public class Problem1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            // System.out.println(i);

            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2 && (i%2!=0) ) {
                System.out.println("ye number prime hai kyuki ye sirf do table mai hi divisible hore hai " + i);
            }

        }
    }
}
