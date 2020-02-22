package Threading;
public class Q5 {
    public static void main(String[] args) throws InterruptedException {
        Sum s1=new Sum();
        Thread t=new Thread(s1);
        t.start();
        synchronized (t){
            try{
                System.out.println("wait till Sum class finishes");
                t.wait();
                Thread.sleep(400);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("total is: "+s1.sum);
    }

}
class Sum implements Runnable{
    int sum=0;
    @Override
    public void run() {
        synchronized (this){
            for(int i=0;i<100;i++)
                sum+=i;
            notify();
        }
    }
}