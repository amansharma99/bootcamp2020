public class Q6 {

    public static void main(String args[]) {

        int a[] = new int[2];
        a[0]=2;
        a[1]=1;
        try
        {
            System.out.println("Access element three :" + a[3]);
            a[0]=a[0]/0;
        }
        catch (ArrayIndexOutOfBoundsException e1)
        {
            System.out.println("Exception thrown From first catch block  :" + e1);
        }
        catch(ArithmeticException e2)
        {
            System.out.println("Exception thrown From second catch block  :" + e2);
        }
        finally
        {
            System.out.println("The finally statement is executed");
        }
    }
}
