class BankAccount
{
    private int Balance=1000;

    public void Withdraw(int Amount)
    {
        if(Amount <= Balance)
        {
            System.out.println(Thread.currentThread().getName()+"Successfully wothdrawed the amount");

            Balance= Balance- Amount;
            System.out.println("Balance is :"+Balance);
        }
        else
        {
            System.out.println(Thread.currentThread().getName()+"Unable to withdraw");
        }
    }


}
class Customer extends Thread
{
    public BankAccount bobj;

    public Customer(BankAccount obj,String Name)
    {
        super(Name);
        this.bobj=obj;
    }
    public void run()
    {
        bobj.Withdraw(800);
    }
}
class ThreadDemo8 
{
    public static void main(String[] arr) throws Exception
    {
        BankAccount bobj=new BankAccount();

        Customer cobj1=new Customer(bobj, "sagar");
        Customer cobj2=new Customer(bobj, "sunil");

        cobj1.start();
        cobj2.start();

        cobj1.join();
        cobj2.join();

        System.out.println("End of Banking Application");
    }
}
