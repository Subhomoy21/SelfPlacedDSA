package CoreAdvanced;
//runtime exception
//unchecked
public class RunTimeExceptionDemo {
    public static void main(String[] args) {
        int a,b,sum;
        try{
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            sum = a+b;
            System.out.println("Addition of a and b is :" + sum);
        }
        catch (ArrayIndexOutOfBoundsException ar){
            System.out.println("Insufficient nos");
        }
    }
}
