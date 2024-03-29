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
    // optimised - (1)
    static int large(int[]arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    // optimised - (2)
    static int[] large2(int [] arr){
        int [] storeIndAndEle = new int[2];
        int max = arr[0];
        int res = 0;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > max){
                res = i;
                max = arr[i];
            }
        }
        for (int i = 0; i < storeIndAndEle.length; i++) {
            storeIndAndEle[0] = res;
            storeIndAndEle[1] = max;
        }
        return storeIndAndEle;
    }
    public static void main(String[] args) {
        int [] arr = {10,5,0,12};
        System.out.println(largest(arr));
        System.out.println(large(arr));
        int[] ans = large2(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
