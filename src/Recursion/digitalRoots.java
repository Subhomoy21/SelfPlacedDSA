package Recursion;
//You are given a number n. You need to find the digital root of n.
// DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

//Input:
//n = 99999
//Output: 9
//Explanation: Sum of digits of 99999 is 45
//which is not a single digit number, hence
//sum of digit of 45 is 9 which is a single
//digit number.
public class digitalRoots {
     static int digitalRoot(int n)
    {
        // add your code here
       // if(n==0 || n==1){
        //    return n;
        //}
        if(n<10){
            return n;
        }
        int ans = digitalRoot(n/10) + n%10; // last digit
        if(ans<10){
            return ans;
        }
        else{
            return  digitalRoot(ans);
        }
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(9999)); // 6 + 3
    }
}
