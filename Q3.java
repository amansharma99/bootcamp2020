public class Q3 {

    static void demo() throws NoClassDefFoundError
    {
        throw new NoClassDefFoundError("Exception");
    }
    public static void main(String args[]) {
        try
        {
            demo();//This gives NoClassDefFoundError
            java.lang.Class.forName("");//This gives ClassNotFoundExecption
        }
        catch (ClassNotFoundException ex)
        {

            System.out.println("This is a ClassNotFoundException Exception");
        }
        catch(NoClassDefFoundError ex)
        {
            System.out.println("This is a NoClassDefFoundError");
        }
    }
}
