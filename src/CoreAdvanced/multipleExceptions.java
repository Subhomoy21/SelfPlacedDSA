package CoreAdvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//https://ide.geeksforgeeks.org/aO095ZvCU3
public class multipleExceptions {
    static void methodA() throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int a = 5, b = 0,c;
        System.out.println("Enter the numeric value for b");
        b = sc.nextInt();
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            c = a/b;
        }
        System.out.println("Exit main()");
    }
    public static void main(String[] args) {
        try{
            methodA();
            Scanner sc = new Scanner(new File("test.in"));
            System.out.println("Exit main()");
        }
        catch (ArithmeticException ex){
            System.out.println("ArithmeticException Caught...........");
        }
        catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException Caught..........");
        }
        catch (Exception ex){
            System.out.println("A new type of execution caught................");
        }
        finally {
            System.out.println("Finally block runs regardless of state of exception.");
        }
        System.out.println("After by catch finally life goes on.......");
    }
}
