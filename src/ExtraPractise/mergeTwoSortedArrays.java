package ExtraPractise;

public class mergeTwoSortedArrays {
    static int[] mTA(int [] arr1 , int arr2[]){
        int n = arr1.length;
        int m  =arr2.length;
        int res[] = new int[n+m];
        int i = 0,j=0,k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                res[k] = arr1[i];
                i++;
                k++;
            }
            else{
                res[k] = arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            res[k++] = arr1[i++];
        }
        while(j<m){
            res[k++] = arr2[j++];
        }
        return res;
    }
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,7};
        int [] arr2 = {2,4,6,9};
        int [] res = mTA(arr1,arr2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
