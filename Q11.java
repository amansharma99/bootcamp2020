abstract class Bank
{
    String name="";
    String type="";
    float roi;
    int accno;
    int branches;
    Bank()
    {

    }
    Bank(String name,float r,int b,int acc)
    {
        this.name=name;
        this.roi=r;
        this.branches=b;
        this.accno=acc;
    }
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("Rate: "+roi);
        System.out.println("Account No:"+accno);
    }

}
class SBI extends Bank
{
    SBI()
    {
        name="State Bank of India";
        type="govt.";
        roi=4.5f;
        accno=2323;
    }
    public void getDetails()
    {
        super.getDetails();
    }
}
class BOI extends Bank
{
    String slogan;
    BOI()
    {
        name="Bank Of India";
        type="govt.";
        roi=4.4f;
        accno=232;
    }
    public void getDetails()
    {
        super.getDetails();
    }
}
class ICICI extends Bank
{
    String facility;
    ICICI()
    {
        name="ICICI";
        type="private";
        roi=4.6f;
        accno=454;

    }

    public void getDetails()
    {
        super.getDetails();
    }
}
class Q11
{
    public static void main(String[] args)
    {
        SBI sbi=new SBI();
        BOI boi=new BOI();
        ICICI i=new ICICI();
        sbi.getDetails();
        boi.getDetails();
        i.getDetails();
    }
}