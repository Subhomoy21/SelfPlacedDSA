package CoreAdvanced;

public class methodCallStack2 {
    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("Exit main()");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("ArithmeticException caught ...");
            ex.printStackTrace();
        }
    }

    static void methodA() {
        System.out.println("Enter methodA()");
        try{
            int a = 5, b = 0;

            int c = a / b; // undefined hai yeh isliye arithmetic exception hai

            System.out.println(c);
        }
        finally{
            System.out.println("finally in methodA()");
        }
        System.out.println("Exit methodA()");
    }
}


