abstract class Abstract
{
    abstract void setDetails();
    abstract void getDetails();
}
interface lib
{
    public void getDetail();
    public void setDetail();
}
class Library extends Abstract
{
    public String Library_Name;
    public int Library_id;

    @Override
    void setDetails()
    {
        Library_Name="THE ROYALLIBRARY";
        Library_id=1001;
    }

    @Override
    void getDetails()
    {
        System.out.println(Library_Name);
        System.out.println(Library_id);
    }
}
class Librarian implements lib
{
    public String Librarian_Name;
    public int Librarian_id;
    public String Librarian_address;

    @Override
    public void setDetail() {
        Librarian_Name="Aman Sharma";
        Librarian_id=3990;
        Librarian_address="Laxmi Nagar East Dellhi";

    }
    @Override
    public void getDetail() {
        System.out.println(Librarian_Name);
        System.out.println(Librarian_id);
        System.out.println(Librarian_address);

    }
}
class user extends Abstract
{
    public String user_name;
    public int user_id;
    public String user_address;
    @Override
    public void setDetails() {
        user_name="Manish";
        user_id=4125;
        user_address="Dwarka West Delhi";

    }
    @Override
    public void getDetails() {
        System.out.println(user_name);
        System.out.println(user_id);
        System.out.println(user_address);

    }
}
class Book implements lib
{
    public String Book_Name;
    public String Book_Author;
    public int Book_Id;
    @Override
    public void setDetail() {
        Book_Name="Advance Java";
        Book_Author="Robert Downey Jr.";
        Book_Id=989;

    }
    @Override
    public void getDetail() {
        System.out.println(Book_Name);
        System.out.println(Book_Id);
        System.out.println(Book_Author);

    }
}
public class Q1
{
    public static void main(String arg[])
    {
        Library l=new Library();
        Librarian ll=new Librarian();
        user u=new  user();
        Book b=new Book();
        System.out.println("***LIBRARY****");
        l.setDetails();
        l.getDetails();
        System.out.println("*****LIBRARIAN*****");
        ll.setDetail();
        ll.getDetail();
        System.out.println("*****USER****");
        u.setDetails();
        u.getDetails();
        System.out.println("****BOOK***");
        b.setDetail();
        b.getDetail();
    }
}