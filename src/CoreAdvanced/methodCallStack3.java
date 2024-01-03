package CoreAdvanced;
 // only use of printStackTrace()
public class methodCallStack3 {
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
    static void methodA()
    {
        System.out.println("Enter methodA()");
        int a = 5, b = 0;
        int c = a / b;
        System.out.println(c);
    }
}
