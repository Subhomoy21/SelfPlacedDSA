package Arrays;
import java.util.*;
public class moveAllZeroesAtEnd {
    static void swap(int [] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void moveZeros(int [] arr){
        // naive solution
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                for (int j = i+1; j < n ; j++) {
                    if(arr[j] !=  0){
                        swap(arr,arr[i],arr[j]);
                    }
                }
            }
        }
    }
    // efficient solution(using two pointers)
    static void zeroesAtEnd(int [] arr){
        int n = arr.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,2,0,2,0,0,4,5};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
       // swap(4,5);
        zeroesAtEnd(arr);
        System.out.println(Arrays.toString(arr));

    }
}
