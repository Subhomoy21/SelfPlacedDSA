package BitsMagic;

public class twoOddOccurring {
    // naive solution
    static void oddAppearing(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                System.out.print(arr[i] + " ");
        }
    }
    // efficient solution
    // GFG question - Two numbers with odd occurrences
    static int[] twoOddNum(int arr[], int N)
    {
        // code here
        //   int [] find = new int[2];
        int xor = 0;
        int res1 = 0;
        int res2  = 0;
        for(int i = 0;i<N;i++){
            xor = xor ^ arr[i];
        }
        int k =  xor & (~(xor - 1));
        for (int i = 0; i < N; i++)
        {
            if ((arr[i] & k) != 0)
                res1 = res1 ^ arr[i];
            else
                res2 = res2 ^ arr[i];
        }
        int find[] = {Math.max(res1,res2),Math.min(res1,res2)};
        return find;
    }
        public static void main(String[] args) {
            int[] arr = {5,6,10,6,10,6,3,3};
            oddAppearing(arr,8);
            System.out.println();
            int find[] = twoOddNum(arr,8);
            for (int i = 0; i < find.length; i++) {
                System.out.print(find[i] + " ");
            }
    }
}
