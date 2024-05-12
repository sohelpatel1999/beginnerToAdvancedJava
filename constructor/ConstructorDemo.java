package constructor;

public class ConstructorDemo {

    String name;
    int age;

    ConstructorDemo(){
        name = " sohe patel";
        age = 14;
    }

    public static void main(String[] args) {
        ConstructorDemo sohel = new ConstructorDemo();
        System.out.println("this is sohel object");
        System.out.println(sohel.name + " this is name");
        System.out.println(sohel.age + " this is age");

    }

}
