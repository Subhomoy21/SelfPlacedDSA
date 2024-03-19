package Arrays;

public class checkIfArrayIsSorted {
    // naive solution
    static boolean isSorted(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if(arr[j] < arr[i]){
                    return false;
                }
            }
        }
        return true;
    }
    // efficient solution
    static boolean isSorted2(int [] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {8,10,12};
        System.out.println(isSorted(arr));
        System.out.println(isSorted2(arr));
    }
}
