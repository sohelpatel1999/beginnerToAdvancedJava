package staticdemo;

public class Staticexample {

    // // declared and Initialization non static the value to variable or object
    // public int sohel = 10;

    // // declared and Initialization static the value to variable or object
    // static int sohel1 = 30;

    // declaring non static variable or object
    public int neel = 5;

    // declaring static variable or object
    public static int sohel = 5;

    public static void main(String[] args) {
        //object banaya hai kuchbhi naam se 
        Staticexample kuchbhi = new Staticexample();
        System.out.println();
        System.out.println("neel is non static "+kuchbhi.neel++);  //5 ++  6
        System.out.println("neel is non static "+kuchbhi.neel);   //6



        System.out.println("sohel is static "+kuchbhi.sohel++);





        //creating second object
        Staticexample kuchbhi2 = new Staticexample();

        
        System.out.println("neel is non static from second object "+kuchbhi2.neel++);
        System.out.println("sohel is static from second object "+kuchbhi2.sohel++);
        System.out.println("sohel is static from second object "+kuchbhi2.sohel);







        // int byClassName = Staticexample.sohel1;
        // int byUsingObject = kuchbhi.sohel1;
        // int byDirectAccessing = sohel1;

        // System.out.println(byClassName + " byClassName");
        // System.out.println(byUsingObject + " byUsingObject");
        // System.out.println(byDirectAccessing + " byDirectAccessing");
    }
}
