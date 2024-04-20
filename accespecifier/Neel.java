
//class parent
class Parent {
    // protected method
    protected void TALK() {
        System.out.println("TALK FUNCTIONALITY FROM PARENT CLASS");
    }
    protected void WALK() {
        System.out.println("WALK FUNCTIONALITY FROM PARENT CLASS");
    }
}

//class child 
public class Neel extends Parent {
    public static void main(String[] args) {

        // create an object of Dog class
        Neel pd = new Neel();
         // access protected method
        pd.TALK();
        pd.WALK();

    }
}