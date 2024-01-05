package CoreAdvanced;
//https://ide.geeksforgeeks.org/Na6HYZ4uJZ
class InvalidBalanceException1 extends Exception
{
    public InvalidBalanceException1(String message)
    {
        super(message);
    }
}
public class UserDefinedException2 {
    public static void main(String[] args) throws InvalidBalanceException1 {
        int balance;
        balance = Integer.parseInt(args[0]);
        updateBalance1(balance);
    }
    public static void updateBalance1(int number)throws InvalidBalanceException1
    {
        if(number < 0)
        {
            throw (new InvalidBalanceException1("Account balance cannot be less than Zero."));
        }

        System.out.println("No exception occured in updateBalance() method");
    }

}
