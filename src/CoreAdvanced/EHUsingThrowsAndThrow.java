package CoreAdvanced;

import java.util.Scanner;
//In Java, exception handling is an important concept that allows you to handle unexpected or
// exceptional situations in your program. The throw and throws keywords are two important aspects of exception handling in Java.
//throw is used to throw an exception explicitly in a method or a block of code. You can throw any type of exception,
// including custom exceptions that you define.
public class EHUsingThrowsAndThrow {
    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("Exit TRY of main()");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("ArithmeticException caught ...");
            ex.printStackTrace();
        }
        System.out.println("Exit main() successfully");
    }
    static void methodA()throws ArithmeticException
    {
        Scanner in = new Scanner(System.in);
        int a = 5, b = 0, c;
        System.out.println("Enter numeric value for variable b");
        b = in.nextInt();
        if(b==0)
            throw new ArithmeticException();
        else
            c = a / b;
        System.out.println("Exit methodA()");
    }
}
