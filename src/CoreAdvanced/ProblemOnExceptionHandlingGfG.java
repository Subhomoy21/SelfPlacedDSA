package CoreAdvanced;
import java.util.Scanner;
//Given two integers (positive , negative or even 0) say a and b.
// Find the minimum value of a$b where $ is any arithmetic operation like multiply(*), Divide(/), Addition(+), Substraction(-).

//Example:
//
//
//Input:
//a = 5, b = -5
//Output:
//-25
//Explanation: 5+(-5) = 0; 5-(-5) = 10;
//5*(-5) = -25; 5/(-5) = -1;
//Minimum of all is 5*(-5) = -25.
class TestClass
{
    int a, b, Min;
    TestClass(){

    };
    TestClass(int x,int y)
    {
        this.a = x;
        this.b = y;
        this.Min = Integer.MAX_VALUE;
    }
    public void findMin()
    {
        // Add your code here.
        // method findMin() which prints the Minimum value of a$b.
        try{
            int sum = a+b;
            if(Min >sum){
                Min = sum;
            }
            int mul = a*b;
            if(Min > mul){
                Min = mul;
            }
            int sub = a - b;
            if(Min>sub){
                Min = sub;
            }
            int div = a/b;
            if(Min > div){
                Min = div;
            }
            System.out.print(Min);
        }
        catch(ArithmeticException e){
            System.out.print(Min);
        }
    }
}
public class ProblemOnExceptionHandlingGfG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        TestClass ts = new TestClass(a,b);
        ts.findMin();
    }
}
