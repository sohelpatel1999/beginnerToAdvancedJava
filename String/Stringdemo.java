package String;

public class Stringdemo {
    public static void main(String[] args) {

        String demo = "Neel sohel sohel india";
        char[] charArray = demo.toCharArray();
        System.out.println(charArray);
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        System.out.println(demo);



        // System.out.println(demo.charAt(0));



        char[] demo1 = { 'N', 'e', 'e', 'l' };
        demo1[3] = 'm';
        for (int i = 0; i < demo1.length; i++) {
            System.out.print(demo1[i]);
        }
    }
}
