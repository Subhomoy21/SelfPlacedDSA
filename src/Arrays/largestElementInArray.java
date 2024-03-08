package Arrays;

public class largestElementInArray {
    // naive solution
    static int largest(int[] arr){
        int n =  arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n ; j++) {
                if(arr[j]>arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {10,5,0,12};
        System.out.println(largest(arr));
    }
}
