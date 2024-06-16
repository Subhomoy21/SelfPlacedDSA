package Arrays;

public class MaximumLengthEvenOddSubarray {
    // naive solution O(n^2)
    public static int maxEvenOdd(int [] arr){
      int n = arr.length;
      int res = 1;
        for (int i = 0; i < n; i++) {
            int curr = 1;
            for (int j = i+1; j < n ; j++) {
                if(arr[j]%2 == 0 && arr[j-1]%2 != 0 || arr[j]%2 != 0 && arr[j-1]%2 == 0 ){
                    curr++;
                }
                else {
                    break;
                }
            }
            res = Math.max(res,curr);
        }
        return res;
    }
     public static void main(String[] args) {
        int arr[] = {10,12,14,7,8};
         System.out.println(maxEvenOdd(arr));
    }
}
