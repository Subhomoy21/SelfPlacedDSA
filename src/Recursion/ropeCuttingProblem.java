package Recursion;

public class ropeCuttingProblem {
    static int maxCuts(int n, int a, int b, int c)
    {
        if(n == 0)
            return 0;
        if(n <= -1)
            return -1;

        int res = Math.max(maxCuts(n-a, a, b, c),
                Math.max(maxCuts(n-b, a, b, c),
                        maxCuts(n-c, a, b, c)));

        if(res == -1)
            return -1;

        return res + 1;
    }
    public static void main(String[] args) {
        System.out.println(maxCuts(23,11,9,12));
        // just doubt
//        int max = Math.max(45,12);
//        System.out.println(max);
        int max = Math.max(Math.max(45,48),Math.max(46,2));
        System.out.println(max);
    }
}
