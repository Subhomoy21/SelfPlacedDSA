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
    public static void main(String[] args) {
        int [] arr = {5,8,3};
        System.out.println(maxSumSub(arr));
    }
}
