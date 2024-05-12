package constructor;

public class ConstructorDemo {
    

    String name;
    int age;

    // no argument
    ConstructorDemo() {
        super();
        name = "Human";
        age = 100;
    }

    // paretermized constructor
    ConstructorDemo(String givenname) {
        name = givenname;
    }

    // paretermized constructor
    ConstructorDemo(String givenname, int givenage) {
        name = givenname;
        age = givenage;
    }

    public static void main(String[] args) {
        // ConstructorDemo sohel = new ConstructorDemo("sohel",14);
        // ConstructorDemo sohel = new ConstructorDemo("sohel",24);
        // System.out.println("this is sohel object");
        // // sohel.name = "sohel";
        // // sohel.age = 24;
        // System.out.println(sohel.name + " this is name");
        // System.out.println(sohel.age + " this is age");

        ConstructorDemo neel = new ConstructorDemo();
        System.out.println(neel.name + " this is name");
        System.out.println(neel.age + " this is age");
    }

}
