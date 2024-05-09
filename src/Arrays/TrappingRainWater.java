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
    // another process
    static int getWater2(int [] arr){
        int n = arr.length;
        int res = 0;
        for (int i = 1 ; i < n-1 ; i++) {
            int lmax= arr[i];
            for (int j = 0; j < i; j++) {
                if(arr[j] > lmax){
                    lmax = arr[j];
                }
            }
            int rmax = arr[i];
            for (int j = i+1; j < n ; j++) {
                if(arr[j] > rmax){
                    rmax = arr[j];
                }
            }
            res = res + Math.min(lmax,rmax) - arr[i];
        }
        return res;
    }
    // efficient solution
    static int getWatereff(int [] arr){
        int n = arr.length;
        int res = 0;
        int[] lmax = new int[n];
        int [] rmax = new int[n];
        lmax[0] = arr[0];
        for (int i = 1; i < n ; i++) {
            lmax[i] = Math.max(lmax[i-1],arr[i]); // left side mein konsa block barra!
        }
        rmax[n-1] = arr[n-1];
        for (int i = n-2; i >= 0 ; i--) {
            rmax[i] = Math.max(rmax[i+1] , arr[i]); // right side mein konsa block barra hai!
        }
        for (int i = 1; i < n-1 ; i++) {
            res = res + Math.min(lmax[i],rmax[i]) - arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[] = {3, 0, 1, 2, 5};
        System.out.println(getWater(arr));
        System.out.println(getWater2(arr));
        System.out.println(getWatereff(arr));
    }
}
