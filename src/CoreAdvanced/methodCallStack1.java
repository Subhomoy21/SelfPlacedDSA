package CoreAdvanced;
//The method call stack is a critical part of how Java (and many other programming languages) handle
// method calls and exceptions. When a method is called, the program creates a new frame on the call
// stack to store the state of the method call, including any local variables and parameters. When the method returns,
// the program pops the frame off the call stack and resumes execution in the calling method.
//Exceptions work similarly. When an exception is thrown,
// program searches up the call stack for the first method with a matching catch block.
// If no matching catch block is found, the program terminates with an uncaught exception.
// If a matching catch block is found, the program resumes execution in that catch block,
// which can handle the exception or rethrow it to be caught by an outer catch block or to terminate the program.
public class methodCallStack1 {
    public static void main(String[] args) {
        methodA();
    }
    static void methodA()
    {
        System.out.println("Enter methodA()");
        int a = 5, b = 0;
        int c = a / b;
        System.out.println(c);
    }
}
