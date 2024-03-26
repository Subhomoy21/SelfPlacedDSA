package Arrays;

public class removeDuplicatesFromSortedArray {
    static int remDuplicates(int []arr){
        // naive solution
        int n = arr.length;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(temp[res - 1] != arr[i]){
                temp[res] = arr[i];
                res++;
            }
        }
        for (int i = 0; i < res; i++) {
                arr[i] = temp[i];
        }
        return res;
    }
    // efficient solution
    static int rem(int [] arr){
        int res = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[res -1]){
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 30, 30, 30};
        int n  = arr.length;
        System.out.println("Before Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        n = remDuplicates(arr);
        System.out.println("After Removal");
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println(remDuplicates(arr));
        System.out.println(rem(arr));
    }
}
