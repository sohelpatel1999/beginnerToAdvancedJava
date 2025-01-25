package twoDarray;

public class Prinitng {
    public static void main(String[] args) {
        int[][] neel1 = { { 920, 235, 1200, 45, 65 }, { 820, 235, 902, 45, 88 }, { 520, 620, 720, 344, 53 } };

        int n = neel1[0].length; // 5

        for (int i = 0; i < n; i++) {
            System.out.print(neel1[0][i] + " ");
        }
        System.out.println();

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(neel1[0][i] + " ");
        }

    }
}
