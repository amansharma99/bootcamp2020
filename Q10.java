package Threading;

public class Q10 {

    final Object obj1=new Object();
    final Object obj2=new Object();
    String str1 = "Hello World";
    String str2 = "Hi There";

    Thread trd1 = new Thread("My Thread 1"){
        public void run(){
            while(true){
                synchronized(obj1){
                    synchronized(obj2){
                        System.out.println(str1);
                    }
                }
            }
        }
    };

    Thread trd2 = new Thread("My Thread 2"){
        public void run(){
            while(true){
                synchronized(obj1){
                    synchronized(obj2){
                        System.out.println(str2);
                    }
                }
            }
        }
    };

    public static void main(String a[]){
        Q10 deadlock = new Q10();
        deadlock.trd1.start();
        deadlock.trd2.start();
    }
}