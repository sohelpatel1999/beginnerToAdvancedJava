public class Evenodd {

    public static void main(String[] args) {
        int n = 18;
        boolean answer = evenorodd(n);
        System.out.println(answer);

    }

    public static boolean evenorodd(int a) {

        if ((a & 1) == 0) {
            return true;
        }
        return false;

    }

}
