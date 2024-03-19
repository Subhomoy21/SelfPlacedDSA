package Arrays;

public class reverseAnArray {
    static void reverse(int [] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(high>low){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        int [] arr = {1,5,6,7};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
