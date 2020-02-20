package Threading;

import java.util.Scanner;

class run extends Thread
{
 private volatile boolean running =true;
 public void run()
 {
     while(running)
     {
         System.out.println("Hello World");
         try
         {
             Thread.sleep(1000);
         }
         catch(InterruptedException ex)
         {
             ex.printStackTrace();
         }
     }
 }
 public void shutdown()
 {
     running=false;
 }
}
public class Q1
{
    public static void main(String[] args) {
        run r=new run();
        r.start();
        System.out.println("Press Any key to stop...");
        Scanner sc=new Scanner(System.in);
        sc.nextLine();
        r.shutdown();
        System.out.println("Task Finished");
    }
}
