package Threading;

public class Q2 {
    public static void main(String[] args) {
        usingthread th= new usingthread();
        usinginterface th2=new usinginterface();
        th.start();
        Thread t2 = new Thread(new usinginterface());
        t2.start();
    }
}
class usingthread extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Hello"+i);
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
}
class usinginterface implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("World"+i);
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
}
