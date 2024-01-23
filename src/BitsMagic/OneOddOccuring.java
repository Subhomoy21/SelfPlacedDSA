package BitsMagic;

public class OneOddOccuring {
    //naive solution
    static int findOdd(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count%2!=0){
                return arr[i];
            }
        }
        return 0;
    }
    //efficient solution
    public static void main(String[] args) {
        int []arr = {4,4,7,4,8,7,7,7,8};
        System.out.println(findOdd(arr));
    }
}
