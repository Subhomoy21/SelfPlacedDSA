package Arrays;

public class TrappingRainWater {
    // naive solution O(n^2)
    static int getWater(int [] bars){
        int n = bars.length;
        int res = 0;
        for (int i = 1 ; i < n-1 ; i++) {
            int lmax= bars[i];
            for (int j = 0; j < i; j++) {
                lmax = Math.max(lmax,bars[j]);
            }
            int rmax = bars[i];
            for (int j = i+1; j < n ; j++) {
                rmax = Math.max(rmax,bars[j]);
            }
            res = res + Math.min(lmax,rmax) - bars[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2, 5};
        System.out.println(getWater(arr));
    }
}
