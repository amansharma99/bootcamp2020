package Threading;

import java.util.Scanner;

public class Q4 {

    boolean odd;
    int count = 0;
    int MAX;

    public void printEven()
    {
        synchronized (this)
        {
            while (count < MAX)
            {

                while (!odd) {
                    try
                    {
                        System.out.println(" "+count);
                        wait();
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                count++;
                odd = false;
                notify();
            }
        }
    }

    public void printOdd() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        synchronized (this)
        {
            while (count < MAX)
            {

                while (odd) {
                    try {
                        System.out.println(" " + count);
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                count++;
                odd = true;
                notify();

            }
        }
    }

    public static void main(String[] args) {

        Q4 oep = new Q4();
        oep.odd = true;
        System.out.println("Enter a number:");
        Scanner sc =new Scanner(System.in);
        oep.MAX=sc.nextInt()+1;
        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printOdd();

            }
        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public void run() {
                oep.printEven();

            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
