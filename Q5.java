class Q5 implements Cloneable{
    int rollno;
    String name;

    FifthQues(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            FifthQues s1=new FifthQues(12,"Aman");

            FifthQues s2=(FifthQues)s1.clone();
            FifthQues s3= s2;

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);
            System.out.println(s3.rollno+" "+s3.name);

        }catch(CloneNotSupportedException c){}

    }
}
