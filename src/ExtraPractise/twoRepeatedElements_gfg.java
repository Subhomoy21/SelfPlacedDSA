package ExtraPractise;
//You are given an array of N+2 integer elements. All elements of the array are in the range 1 to N.
// Also, all elements occur once except two numbers which occur twice. Find the two repeating numbers.
//
//Note: Return the numbers in their order of appearing twice. So, if X and Y are the repeating numbers,
// and X repeats twice before Y repeating twice, then the order should be (X, Y).

//Example 1:
//Input:
//N = 4
//array[] = {1,2,1,3,4,3}
//Output: 1 3
//Explanation: In the given array,
//1 and 3 are repeated two times.
public class twoRepeatedElements_gfg {
    static int[] twoRepeated(int [] arr , int N){
        int ans[] = new int[2];
        int count[] = new int[N+2];
        int j = 0;
        for (int i = 0; i < N+2; i++) {
            count[arr[i]]++;
            if(count[arr[i]]==2){
                ans[j] = arr[i];
                j++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,1,3,4,3};
        int [] ans = twoRepeated(arr,4);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
