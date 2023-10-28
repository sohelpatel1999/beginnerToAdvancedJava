package Variable;

public class GlobalDemo {

    public int x;

    public int y = 110;

    public static void main(String[] args) {
        GlobalDemo globaldemo = new GlobalDemo();
        System.out.println("This is the value of x " + globaldemo.x);
        System.out.println("This is the value of y " + globaldemo.y);

    }

}
