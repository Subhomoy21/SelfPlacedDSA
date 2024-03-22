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

        }
        return res;
    }
    public static void main(String[] args) {

    }
}
