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
    public static void main(String[] args) {
        int arr[] = {2, 3, 10, 6, 4, 8, 1};
        System.out.println(maximumDifference(arr));
        System.out.println(maxDifference(arr));
    }
}
