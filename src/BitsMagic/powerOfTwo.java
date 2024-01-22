package BitsMagic;

public class powerOfTwo {
    // naive solution
    static boolean isPowOfTwo(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2 != 0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
    // efficient solution
    static boolean isPowOf2(int n){
        if(n==0){

        }
    }
    public static void main(String[] args) {
        System.out.println(isPowOfTwo(64));
    }
}
