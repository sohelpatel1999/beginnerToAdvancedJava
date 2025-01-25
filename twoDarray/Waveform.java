package twoDarray;

public class Waveform {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30, 40, 50 },
                { 60, 70, 80, 90, 100 },
                { 110, 120, 130, 140, 150 },
                { 160, 170, 180, 190, 200 } };

        for (int i = 0; i < arr.length; i++) {   // i = 2
            if (i % 2 == 0) {     // 2 %2 == 2
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");  
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }

        // for (int i = 0; i < arr[0].length; i++) {
        // System.out.print(arr[0][i] + " ");
        // }
        // System.out.println();

        // for (int i = arr[0].length - 1; i >= 0; i--) {
        // System.out.print(arr[0][i] + " ");
        // }

    }
}
