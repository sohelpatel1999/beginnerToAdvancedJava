class Data {
    // private variable
    private String name;
    public String name1;
    String neel = "this is neel ka variable of default acces spcifier";
}

public class Privatedemo {
    public static void main(String[] main){

        // create an object of Data
        Data d = new Data();

        // access private variable and field from another class
        // d.name = "Programiz";
        d.name1 = "Programiz";
    }
}