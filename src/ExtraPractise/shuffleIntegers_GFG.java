package ExtraPractise;

//Given an array arr of n elements in the following format {a1, a2, a3, a4, ... , an/2, b1, b2, b3, b4, ... , bn/2}, the task is shuffle the array to {a1, b1, a2, b2, a3, b3, ... , an/2, bn/2} without using extra space.
//Note that n is even.
//Example 1:
//Input:
//n = 4, arr = {1, 2, 9, 15}
//Output:
//1 9 2 15
//Explanation:a1=1, a2=2, b1=9, b2=15. So the final array will be: a1, b1, a2, b2 = {1,9,2,15}.
public class shuffleIntegers_GFG {
    static void shuffleArray(int arr[], int n)
    {
        // Your code goes here
        int img = 10000;
        for(int i = 0;i<n/2;i++){
            arr[i] = arr[i] + arr[n/2+i] * img; // arr[i] = a , arr[i + n/2] = b
        }
        int j = n-1;
        for(int i = n/2-1;i>=0;i--){
            arr[j] = arr[i]/img;
            arr[j-1] = arr[i]%img;
            j = j-2;
        }
    }
    public static void main(String[] args) {
       int arr[] = {1, 2, 9, 15};
       int n = 4;
      shuffleArray(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
