package Arrays;

public class maximumConsecutiveOnesInABinaryArray {
    // naive solution O(n^2)
    static  int maxCon1(int [] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int curr = 0;
            for (int j = i; j <n ; j++) {
                if(arr[j] == 1){
                    curr++;
                }
                else{
                    break;
                }
            }
            count = Math.max(count,curr);
        }
        return count;
    }
    // efficient solution O(n)
    static int maxCon2(int arr[]){
        int n = arr.length;
        int count = 0;
        int curr = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                count = Math.max(curr,count);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,0,0,0,1,1};
        System.out.println(maxCon1(arr));
        System.out.println(maxCon2(arr));
    }
}
