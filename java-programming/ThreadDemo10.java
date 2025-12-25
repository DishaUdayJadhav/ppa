class Demo extends Thread
{
    public void run()
    {

    }
}



class ThreadDemo10
{
    public static void main(String[] args)
    {
        Demo obj=new Demo();

        System.out.println("Current Priority is :"+obj.getPriority());
        obj.setPriority(10);
        System.out.println("current Priority is :"+obj.getPriority());
    }
}
