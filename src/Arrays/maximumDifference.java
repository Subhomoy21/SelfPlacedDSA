package Arrays;

public class maximumDifference {
    static int maximumDifference(int[] nums) {
        //naive solution
        int res = nums[1] - nums[0];
        int  n = nums.length;
        for(int i = 0; i<n-1;i++){
            for(int j = i+1 ;j<n ;j++){
                res = Math.max(res,nums[j] - nums[i]);
            }
        }
        return res;
    }
    // from deeskha di notes
    static int maxDifference(int[] nums) {
        //naive solution
        int diff = 0;
        int  n = nums.length;
        for(int i = 0; i<n-1;i++){
            for(int j = i+1 ;j<n ;j++){
               if(nums[j] - nums[i] >  diff){
                   diff = nums[j] - nums[i];
               }
            }
        }
        return diff;
    }
    // efficient solution!
    static int maxDiffEff(int [] arr){
        int n = arr.length;
        int res = arr[1] - arr[0];
        int miVal = arr[0];
        for (int i = 1; i <n ; i++) {
            res = Math.max(res,arr[i]-miVal);
            miVal = Math.min(arr[i] , miVal);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maximumDifference(arr));
        System.out.println(maxDifference(arr));
        System.out.println(maxDiffEff(arr));
    }
}
