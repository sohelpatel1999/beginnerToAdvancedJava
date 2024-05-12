package staticdemo;

public class StaticblockExample {
    int neel = 8;
    static { 
        // int neel = 5;
        // StaticblockExample n = new StaticblockExample();
        // System.out.println(neel + "this is static block");
        System.out.println("this is satic block");
    }

    public static void main(String[] args) {
        System.out.println("this is main method ");
        // sohel();
    }
}
