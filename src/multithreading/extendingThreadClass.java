package multithreading;
//Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU. Each part of such program is called a thread. So, threads are light-weight processes within a process.
//
//Threads can be created by using two mechanisms :
//
//Extending the Thread class
//Implementing the Runnable Interface
//Thread creation by extending the Thread class
//We create a class that extends the java.lang.Thread class.
// This class overrides the run() method available in the Thread class.
// A thread begins its life inside run() method.
// We create an object of our new class and call start() method to start the execution of a thread.
// Start() invokes the run() method on the Thread object.
class Test extends Thread
{
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Test Thread");
        }
    }
}
public class extendingThreadClass {
    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        t.start();
        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Main Thread");
            Thread.sleep(1);
        }
    }
}
