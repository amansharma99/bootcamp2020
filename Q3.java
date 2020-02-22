
package Threading;

import java.util.Scanner;

class Line {

    ////Synchronized Method
    synchronized public void getLine()
    {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        System.out.println("End of Synchronized Method");
    }

    ////Synchronized Block
    /*public void getLine() {
        synchronized (this) {
            for (int i = 0; i < 4; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
            System.out.println("End of Synchronized BLock");
        }
    }*/
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
        Line obj = new Line();
        Th th1=new Th(obj);
        Th th2=new Th(obj);
        th1.start();
        th2.start();
    }
}

