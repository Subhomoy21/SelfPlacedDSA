package ExtraPractise;

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
