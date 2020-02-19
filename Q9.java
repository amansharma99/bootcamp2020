abstract class furniture {
    public abstract boolean checkStress();
    public abstract boolean checkfire();

}
class table extends furniture{
    String type;
    boolean fire;
    boolean stress;

    public String getType() {
        return type;
    }

    public table(String t, boolean f, boolean s)
    {
        this.type=t;
        this.fire=f;
        this.stress=s;
    }
    public boolean isFire() {
        return fire;
    }

    public boolean isStress() {
        return stress;
    }
    @Override
    public boolean checkStress()
    {
        return stress;
    }

    @Override
    public boolean checkfire() {
        return fire;
    }
}
class chair extends furniture{
    String type;
    boolean fire;
    boolean stress;

    public String getType() {
        return type;
    }

    public chair(String t, boolean f, boolean s)
    {
        this.type=t;
        this.fire=f;
        this.stress=s;
    }
    public boolean isFire() {
        return fire;
    }

    public boolean isStress() {
        return stress;
    }
    @Override
    public boolean checkStress()
    {
        return stress;
    }

    @Override
    public boolean checkfire() {
        return fire;
    }
}
public class Q9 {
    public static void main(String[] args) {
        chair ch = new chair("wooden", true, true);
        table tb = new table("metal", true, true);
        System.out.println("Chair");
        System.out.println("Type:"+ch.type);
        System.out.println("Stress resistant:"+ch.checkStress());
        System.out.println("Fire Resistant:"+ch.checkfire());
        System.out.println("*********************************");
        System.out.println("Table");
        System.out.println("Type:"+tb.type);
        System.out.println("Fire Resistant"+tb.checkfire());
        System.out.println("Stress Resistant"+tb.checkStress());
    }
}
