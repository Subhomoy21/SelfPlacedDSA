package Arrays;

public class maximumSumSubarray {
    static  int maxSumSub(int [] arr){
        int n = arr.length;;
        int maximum = arr[0];
        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = i; j < n ; j++) {
                sum += arr[j];
                maximum = Math.max(maximum,sum);
            }
        }
        return maximum;
    }
    // efficient solution
     // O(n)
    static int maxSum(int[]arr){
        int n = arr.length;
        int res = arr[0];
        int maxEnd = arr[0];
        for (int i = 1; i < n ; i++) {
            maxEnd = Math.max(maxEnd + arr[i] , arr[i]);
            res = Math.max(res,maxEnd);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {5,8,3};
        System.out.println(maxSumSub(arr));
        System.out.println(maxSum(arr));
    }
}
