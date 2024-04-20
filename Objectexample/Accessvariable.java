package Objectexample;
import Variable.GlobalDemo;

public class Accessvariable {
    

    public static void main(String[] args) {
        System.out.println("hello world");
        GlobalDemo obbjec = new GlobalDemo();
        // neel n = new neel():
        int neelage = obbjec.x;
        System.out.println(neelage);
        System.out.println("The value of x from GlobalDemo Class " + obbjec.x);

    }
}
