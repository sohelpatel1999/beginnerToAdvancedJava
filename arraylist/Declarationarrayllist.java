package arraylist;

import java.util.ArrayList;

public class Declarationarrayllist {

    public static void main(String[] args) {

        String sohel = "1234";
        int[] arr = new int[5];
        ArrayList<Integer> neel = new ArrayList<>();

        // System.out.println(sohel.length()); // 5
        // System.out.println(arr.length); // 5
        System.out.println(neel.size()); // 0

        // add
        neel.add(55);
        neel.add(65);
        neel.add(75);
        neel.add(85);



        for(int i = 0;i<neel.size();i++){
            System.out.println(neel.get(i));
        }

        // System.out.println(neel.size()); // 0


        // System.out.println(arr[1]);
        System.out.println(neel.get(0));

    }

}
