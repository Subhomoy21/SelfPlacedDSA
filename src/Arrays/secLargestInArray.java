package Arrays;

public class secLargestInArray {
    // linear naive solution
    static int getLargest(int arr[]){
        int n = arr.length;
        int largest = 0;
        for (int i = 1; i < n ; i++) {
            if(arr[i] > arr[largest]){
                largest = i;
            }
        }
        return largest;
    }
    static int  secLargest(int [] arr){
        int n  = arr.length;
        int largest = getLargest(arr);
        int res = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i] != arr[largest]){
                if(res == -1){
                    res = i;
                }
                else if(arr[i] > arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
    // 2nd one

    public static void main(String[] args) {
        int arr[] = {5,20,12,20,10};
        System.out.println(secLargest(arr));
    }
}
