package Arrays;

public class leaderInAnArray {
    // important question
    static void leaders(int [] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            boolean check = false;
            for (int j = i+1; j <n ; j++) {
                if(arr[i] <= arr[j]){
                    check = true;
                    break;
                }
            }
            if(check == false){
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        leaderInAnArray leader = new leaderInAnArray(); // first time printing the o/p using the class
        int [] a = {7,10,4,3,6,5,2};
        leader.leaders(a);
    }
}
