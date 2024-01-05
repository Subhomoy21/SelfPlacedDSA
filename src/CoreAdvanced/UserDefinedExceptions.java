package CoreAdvanced;

class InvalidBalanceException extends Exception
{
    public InvalidBalanceException(String message)
    {
        super(message);
    }
}
public class UserDefinedExceptions {
    public static void main(String[] args) {
        int balance;
        try
        {
            balance = Integer.parseInt(args[0]);
            updateBalance(balance);
        }
        catch(InvalidBalanceException ex)
        {
            System.out.println("Caught in catch of InvalidBalanceException");
            ex.printStackTrace();
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Caught in catch of NumberFormatException");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Caught in catch of ArrayIndexOutOfBoundsException");
        }
        catch(Exception ex)
        {
            System.out.println("Caught in catch of Parent Exception");
        }
        System.out.println("Main method executed successfully");
    }
    public static void updateBalance(int number)throws InvalidBalanceException
    {
        if(number < 0)
        {
            throw (new InvalidBalanceException("Account balance cannot be less than Zero."));
        }
        System.out.println("No exception occured in updateBalance() method");
    }

}
