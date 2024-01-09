package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

//Given an ArrayList of ArrayLists arr. Find the minimum vertical sum. ArrayLists inside the ArrayList arr may not be of the same size.
//The vertical sum is defined as described below:
//If we have an ArrayList of ArrayLists arr:
//1 2 3 4
//5 6
//7 8 9
//The vertical sums are: Sum of {1 5 7}, Sum of {2 6 8}, Sum of {3 9}, Sum of {4}.
//Example:Input:
//arr = {{2 3 5}, {1 2}, {1 4 5 1}}
//Output:1
//Explanation:
//Here N  = 3. So we have 3 ArrayList
//inside arr. Now, the first ArrayList
//is of size 3 and elements  are {2 3 5}.
//The second ArrayList is of size 2 and
//elements are {1 2}. The third ArrayList
//is of size 4 and elements are {1 4 5 1}.
//2 3 5
//1 2
//1 4 5 1
//So, the vertical sums are {2+1+1},
//{3+2+4}, {5+5},{1}. 1 is the min
//vertical sum here.
public class minimumVerticalSum {
     static int minimum_vertical_sum(ArrayList<ArrayList<Integer>> arr) {
        //Your code here
        int maxList = 0;
        int min = Integer.MAX_VALUE;
        // getting max ArrayList size from the given arrayList
        for(int i = 0;i<arr.size();i++){
            maxList = Math.max(arr.get(i).size(),maxList);
        }
        for(int i=0;i<maxList;i++){
            int sum = 0;
            for(int j = 0; j <arr.size();j++){
                if(i < arr.get(j).size()){
                    sum = sum + arr.get(j).get(i);
                }
            }
            // update min after every column iteration
            min = Math.min(min,sum);
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking the  total number of rows
        int n = sc.nextInt();
        // declaring and initializing an arraylist
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // taking the numbers of column
            int m = sc.nextInt();
        // declaring and initializing an arraylist for each row
        ArrayList<Integer> temp = new ArrayList<>();
        for (int j = 0; j < m ; j++) {
            temp.add(sc.nextInt());
        }
        arr.add(temp);
        }
        System.out.println(minimum_vertical_sum(arr));
    }
}
// approach
/* Simple Implementation
For each column find the sum of each arrayList element and then find the minimum among them.
for j 0 to maximum column:
     sum=0
     for i 0 to n:
           sum=sum+arr.get(i).get(j) //syntax of arraylist is get
    ans update
return sum */
