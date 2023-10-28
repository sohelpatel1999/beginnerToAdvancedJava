package Objectexample;
public class objectDemo {

    public int sum = 123;
    //sohel

    //we have created a static Method by Name demoStaticMethod
    public static void Neel(){
        System.out.println("I am Static Method");
    }

    //we have created a Non static Method by Name demoStaticMethod
    public void Sohel(){
        System.out.println("I am Not static Method");
    }

    public static void main(String[] args) {
        //creation of object to Access Element in class
        objectDemo object = new objectDemo();

        // Accesing the non static only by using object
        object.Sohel();

        // Accessing the Static Method by using three types
        // 1 by using object
        object.Neel();

        // 2 using class Name
        objectDemo.Neel();

        // 3 direct using method name
        Neel();
    }
}
