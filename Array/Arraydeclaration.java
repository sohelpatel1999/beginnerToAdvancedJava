/**
 * Arraydeclaration
 */
public class Arraydeclaration {

    public static void main(String[] args) {

        // type 1
        String[] neel = { "Dhoni", "Virat", "Rohit", "Bumrah" };
        System.out.println(neel[1] + " before");
        neel[1] = "neel";
        System.out.println(neel[1] + " after");

        // type 2
        String[] sohel = new String[10]; // {"less than 5", "less than 5 ", "less than 5", "less than 5", "less than 5",
                                         // "more than 5", "more than 5", "more than 5", "more than 5", "more than 5"
                                         // }
        sohel[0] = "Cummins";
        sohel[1] = "Cummins";
        sohel[2] = "Cummins";
        sohel[3] = "Warner";
        System.out.println(sohel.length);
        System.out.println(sohel[0]);
        System.out.println(sohel[3]);
        // System.out.println(sohel[4]);

        for (int i = 0; i < sohel.length; i++) {
            if (i < 5) {
                sohel[i] = "less than 5";
            } else {
                sohel[i] = "more than 5";
            }

        }
        for (int i = 0; i < sohel.length; i++) {
            System.out.println("value of index " + i + " " + sohel[i]);
        }

        // System.out.println(sohel[0]);
        // System.out.println(sohel[3]);

    }
}