package Arrays;

public class frequenciesInSortedArray {
    static void frequenciesInSortedArray(int [] arr){
        int n = arr.length;
        int frq = 1;
        int i = 1;
        while(i<n){
            while(i<n && arr[i-1] == arr[i]){
                frq++;
                i++;
            }
            System.out.println(arr[i-1] + " " +frq);
            i++;
            frq = 1;
        }
        if(n==1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1] + " " + 1);
        }
    }
    public static void main(String[] args) {
        int [] arr = {2,2,2,2,5,5,5,6,7,8,10,10,10};
        frequenciesInSortedArray(arr);
    }
}
