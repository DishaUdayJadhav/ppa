class Base
{
    public int x,y;

    public Base(int a,int b)
    {
        this.x=a;
        this.y=b;
    }
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }
}
class Derived extends Base
{
    public int x,y;

    public Derived()
    {
        super(11,21);   //use 1 of super keyword
        this.x=51;
        this.y=101;
    }

    public void Fun()
    {
        super.Fun();    //use 2 of super keyword
        System.out.println("Inside Derived Fun");


        System.out.println("Value of x is :"+x);
        System.out.println("Value of x using super :"+super.x); //use 3 of super  keyword
    }
}



class SuperDemo 
{
    public static void main(String[] a) 
    {
        Derived dobj=new Derived();
        dobj.Fun();
    }
}
