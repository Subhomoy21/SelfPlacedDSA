package Mathematics;

import java.util.Scanner;

public class CheckForPrime {
    static boolean checkPrime(int n){
        if(n==1){
         return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for (int i = 5; i * i <= n ; i=i+6) {
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int n = sc.nextInt();
            if(checkPrime(n)){
                System.out.println("It is a prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
        }while (true);

    }
}
