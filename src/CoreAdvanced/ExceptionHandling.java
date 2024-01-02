package CoreAdvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        //sensitive code inside TRY, which might generate an exception
        try{
            // below statement nay throws a FileNotFountException
            Scanner sc = new Scanner(new File("test.in"));
            //if everything goes well, below statement would be executed
            //if an exception is occurred in previous statement
            //below statement would not be executed.
            System.out.println("Exit main()");
        }
        // error handling separated from main logic
        catch(FileNotFoundException ex)
        {
            System.out.println("File not Found caught...........................");
        }
        finally{

            System.out.println("finally-block runs regardless of the state of exception");
        }

        System.out.println("After try-catch-finally, life goes on");
    }
}
