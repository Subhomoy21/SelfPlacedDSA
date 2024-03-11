package Arrays;

// we are finding the index !

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
    // 2nd one(using one traversal)
    static int secLargest2(int [] arr){
        int res = -1;
        int largest = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[largest]){
                res = largest;
                largest = i;
            }
            else if(arr[i] != arr[largest]){
                if((res == -1) || (arr[i] > arr[res])){
                    res = i;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {5,20,12,20,10};
        System.out.println(secLargest(arr));
        System.out.println(secLargest2(arr));
    }
}
