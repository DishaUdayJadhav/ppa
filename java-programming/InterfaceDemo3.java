interface Demo
{
    void Fun();
}

interface Hello extends Demo
{
    void Gun();
}

class Marvellous implements Hello
{
    public void Fun()
    {
        System.out.println(" Inside method Fun");
    }
    public void Gun()
    {
        System.out.println("Inside method Gun");
    }
}


class InterfaceDemo3
{
    public static void main(String[] args)
    {
        Marvellous mobj=new Marvellous();
        mobj.Fun();
        mobj.Gun();
    }
}
