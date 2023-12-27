package BitsMagic;

public class CheckIfKthBitIsSetOrNot {
    // O(k) naive solution1
    static void isSet(int n,int k){
        int x = 1;
        for (int i = 0; i < (k-1); i++) {
            x = x*2;
        }
        if((n&x)!=0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        isSet(5,3);
    }
}
