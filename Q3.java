
package Threading;

import java.util.Scanner;

class Line
{
    synchronized public void getLine()
    {
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
            try
            {
                Thread.sleep(400);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}

class Th extends Thread
{

    Line line;

    Th(Line line)
    {
        this.line = line;
    }

    @Override
    public void run()
    {
        line.getLine();
    }
}
public class Q3
{
    public static void main(String[] args) {
        Line obj=new Line();
        Th th1=new Th(obj);
        Th th2=new Th(obj);
        th1.start();
        th2.start();
        System.out.println("Task Finished");
    }
}

