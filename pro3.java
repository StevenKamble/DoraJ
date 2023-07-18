import java.io.*;
public class pro3 extends Thread
{
    public void run()
    {
        System.out.println("Thread is running "+this.getName());

    }
    public static void main(String args[])
    {
        pro3 t=new pro3();
        pro3 t1=new pro3();
        
        t.setName("Thread 1");        
        t1.setName("Thread 2"); //this thread 2 will execute first
        
        t.setPriority(1);
        t1.setPriority(10);
        t.start();
        t1.start();
    }
}
