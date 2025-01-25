package twoDarray;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // english[0] , hindi[1] , math[2]

        // int[] neel = { 90, 35, 100 };
        // int[] sohel = { 80, 35, 90 };
        // int[] ruhaan = { 50, 60, 70 };
        // System.out.println(sohel[2]);
        // System.out.println(ruhaan[0]);

        int[][] example2d = {
                { 920, 235, 1200 },
                { 820, 235, 902 },
                { 520, 620, 720 },
                { 420, 20, 70 },
                { 520, 320, 720 } };
        System.out.println(example2d[1]); // adress of index
        System.out.println(example2d[2]); // adress of index 2
        System.out.println(example2d.length);
        System.out.println(example2d[1].length);
        System.out.println(example2d[2][1]);
        example2d[3][2] = 90;
        System.out.println(example2d[3][2]);

        // System.out.println(example2d.length); // 3
        int Neel = 0;
        int neel = 1;

        // int[][] neel = new int[3][3];
        // { {0,0,0},{0,0,0} ,{0,0,0} }
        int[][] neel1 = { { 920, 235, 1200, 45, 65 }, { 820, 235, 902, 45, 88 }, { 520, 620, 720, 344, 53 } };
        // System.out.println(neel[2]);

        for (int i = 0; i < neel.length; i++) { // 3 2
            for (int j = 0; j < neel[i].length; j++) { // 5 4

                neel[i][j] = 7;
                System.out.print(neel[i][j] + " ");
                // 7 7 7 7 7
                // 7 7 7 7 7 line change
                // 7 7 7 7 7
            }
            System.out.println();
        } // i = 2 j = 4

        // for (int i = 0; i < neel.length; i++) {
        // System.out.println(i); // 2
        // for (int j = 0; j < neel[i].length; j++) {
        // System.out.println("Enter value of at index [" + i + j + "]");
        // neel[i][j] = sc.nextInt();
        // }
        // }

        // System.out.println(neel);
        // System.out.println(neel[0]);
        // System.out.println(example2d[0]);
        // System.out.println(example2d[0][0]);

    }

}
