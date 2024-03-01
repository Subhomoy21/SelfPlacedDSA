package Arrays;

public class operationsOnArray {
    // operations in array!
    static  int search(int [] arr,int x){ // O(n)
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = new int[100]; // fixed size array!
        int [] prr = {4,5,9,8,3};
        System.out.println(search(prr,9));
    }
}
