package Arrays;

public class leftRotateByd {
    static void displayArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // naive solution
    static void leftRotateOne(int [] arr){
        int n = arr.length;
        int temp = arr[0];
        for (int i = 1; i < n ; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }
    static void leftRotateByd(int [] arr, int d){
        int n = arr.length;
        for (int i = 0; i < d; i++) {
            leftRotateOne(arr);
        }
    }
    // better solution
    static void leftRotateBetter (int [] arr , int d){
        int n = arr.length;
        int [] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < n; i++) {
            arr[i-d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n-d+i] = temp[i];
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        displayArr(arr);
//        leftRotateByd(arr,2);
//        displayArr(arr);
        leftRotateBetter(arr,2);
        displayArr(arr);
    }
}
