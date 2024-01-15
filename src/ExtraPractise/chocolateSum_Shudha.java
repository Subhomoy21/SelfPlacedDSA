package ExtraPractise;

import java.util.Arrays;
import java.util.Scanner;

public class chocolateSum_Shudha {
    static int chocolateDistribution(int n , int x, int[]arr){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-x+1 ; i++) { // subset of 3 karke jitna chale
            int diff = arr[i+x-1] - arr[i];
            if(diff<min){
                min = diff;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array:");
        int n = sc.nextInt();
        System.out.println("Enter the number of students");
        int x = sc.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The minimum number of chocolate distributed: ");
        System.out.println(chocolateDistribution(n,x,arr));
    }
}
