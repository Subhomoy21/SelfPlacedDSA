package multithreading;
//Thread creation by implementing the Runnable Interface
//We create a new class which implements java.lang.Runnable interface and override run() method.
// Then we instantiate a Thread object and call start() method on this object.
class test implements Runnable{
    public void run(){
        System.out.println("In test thread..");
    }
}
public class implementingRunnableInterfaces {
    public static void main(String[] args) {

    }
}
//Thread Class vs Runnable Interface
//
//If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance.
// But, if we implement the Runnable interface, our class can still extend other base classes.
//We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like
// yield(), interrupt() etc. that are not available in Runnable interface.
//Using runnable will give you an object that can be shared amongst multiple threads.