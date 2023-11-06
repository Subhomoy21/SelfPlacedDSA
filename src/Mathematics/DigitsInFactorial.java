package Mathematics;

public class DigitsInFactorial {
    static int digitsInFactorial(int N){

        // naive solution
        // int fact = 1;
        // for(int i = 2;i<=N;i++){
        //     fact = fact * i;
        // }
        // int count = 0;
        // while(fact>0){
        //     count++;
        //     fact = fact/10;
        // }
        // return count;

        // optimised approch
        long count=0;
        if(N<0){
            return 0;
        }
        if(N==0 && N==1) return 1;

        double res=0;

        for(long i=2; i<=N; i++)
        {
            res += Math.log10(i);
        }
        return (int)(Math.floor(res)) + 1;
    }
    public static void main(String[] args) {
        System.out.println(digitsInFactorial(6));
    }
}
