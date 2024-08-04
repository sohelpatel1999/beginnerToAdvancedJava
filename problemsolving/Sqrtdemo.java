public class Sqrtdemo {
    public static void main(String[] args) {
        int N = 61;   //7
        int N1 = 36;   //6
        int N2 = 65;   //8
        int N3 = 15;   //3

        int ans = calculateSqrt(52);
        System.out.println(ans);
       
        
    }


    public static int calculateSqrt(int N){  //5

        int answer = 1;
        int i = 1;

        // for(int i = 1; i*i<=N;i++){
        //     answer = i; //2
        // }

        
        while (i*i<=N) {
            answer = i;
            i++;
        }

       
        return answer;

    }





}
