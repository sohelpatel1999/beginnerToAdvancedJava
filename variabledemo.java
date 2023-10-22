public class variabledemo {
    // declaring the global variable
    int age;

    // declaring and intializing variable
    int rollNo = 1;

    public static void main(String[] args) {

        // declare the local variable datatypes and name of the variable
        int demo;
        // initialize the varaible the value 20
        // in method the local vaiable does not take default value
        // System.out.println(demo);

        // declaring and initializing local variable together
        int num = 20;
        System.out.println(num);
        System.out.println("Hello World=" + num + " sohel" );

        // double salary = 1000000.123456789d;
        // System.out.println(salary);

        variabledemo vd = new variabledemo();
        System.out.println(vd.age);
        System.out.println(vd.rollNo);

    }
    

}
