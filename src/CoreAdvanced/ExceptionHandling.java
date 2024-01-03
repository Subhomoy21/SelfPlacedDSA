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
            /*
            if the file cannot be found the exception is caught in this catch-block.
            in some situation you may need to perform some clean up operations or open another file instead.
             */
        }
        //OPTIONAL
        // always run regardless of exception status
        finally{
            System.out.println("finally-block runs regardless of the state of exception");
        }
        //OPTIONAL
        //after try catch finally
        // will not be executed in case of an uncaught exception....
        System.out.println("After try-catch-finally, life goes on");
    }
}
