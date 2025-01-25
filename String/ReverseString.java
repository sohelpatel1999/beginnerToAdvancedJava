package String;

public class ReverseString {
    public static void main(String[] args) {
        String rev = "dcba"; // abcd
        // step 1 is to convert string in Character array
        String answer = revstring("dcba");
        System.out.println(answer);
    }

    public static String revstring(String st) {
        System.out.println(st);

        // step 1 is to convert string in Character array
        char[] arr = st.toCharArray(); //[k,u,c,h,b,h,i] "kuchbhi"  
        //   arr1[2]
        int sp = 0;
        int ep = arr.length - 1;

        //edcba
        while (sp < ep) {     //[1   <   2]
            char temp = arr[sp];     //
            arr[sp] = c[ep];       //
            arr[ep] = temp;
            sp++;
            ep--;
        }

        return String.valueOf(arr);
    }
}
