public class Sumofarray {
    public static void main(String[] args) {
        int[] neel = { 10, -20, -30, -40, 100, 200, 200 }; // 100
        int answer = sumOfArray(neel);
        System.out.println(answer);
    }

    //method
    public static int sumOfArray(int[] arr) {
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { // time complexity O(n)
            sum = sum + arr[i];
        }
        return sum;
    }

}
