package Mathematics;

public class Exactly3Divisor {
    static int exactly3Divisors(int N){
        int count = 0;
        for(int i = 2;i*i<=N;i++){
            if(isPrime(i) && i*i<=N){
                count++;
            }
        }
        return count;
    }
     static boolean isPrime(int n){
        if(n==2||n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i = 5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(exactly3Divisors(6));
    }
}
