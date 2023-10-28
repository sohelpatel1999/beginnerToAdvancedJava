package Objectexample;
import Variable.GlobalDemo;

public class Accessvariable {
    

    public static void main(String[] args) {
        System.out.println("hello world");
        GlobalDemo globalDemo = new GlobalDemo();
        System.out.println(globalDemo.x);
        System.out.println("The value of x from GlobalDemo Class " + globalDemo.y);

    }
}
