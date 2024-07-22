package Arrays;

public class maximumCircularSubarraySum {
    // naive solution
    static int maxCircularSubSum(int arr[]){  // O(n^2)
        int n = arr.length;
        int res = arr[0];
        for (int i = 0; i < n; i++) {
            int currMax = arr[i];
            int currSum = arr[i];
            for (int j = 1; j < n; j++) {
                int ind = (i+j)%n; // circular
                currSum = currSum + arr[ind];
                currMax = Math.max(currMax,currSum);
            }
            res = Math.max(currMax,res);
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr = {5,-2,3,4};
        System.out.println(maxCircularSubSum(arr));
    }
}
