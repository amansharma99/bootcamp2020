class Singleton
{
    private static Singleton single_instance = null;
    public String s;

    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}

// Driver Class
public class Q4
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
    }
}
