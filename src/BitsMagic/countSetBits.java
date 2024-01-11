package BitsMagic;

public class countSetBits {
    // naive solutions
    static int countSetBits(int n){
        int res = 0;
        while(n>0){
            if(n%2==1){  // or n%2!=0
                res++;
            }
            n = n/2;
        }
        return res;
    }
    // naive solution ka optimized version
    static int countSetBits2(int n){
        int count =0;
        while(n>0){
            count = count + (n&1);
            n = n/2;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countSetBits(5));
        System.out.println(countSetBits2(5));
    }
}
