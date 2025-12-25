import java.io.*;


class FileIO2 
{
    public static void main(String[] args)  
    {
        try
        {
            FileWriter fwobj = new FileWriter("MarvellousX.txt");
            fwobj.write("Pre-Placement Activity Batch 52");
            fwobj.write("Logic Building with industrial project development");
            fwobj.close();
        }
        catch(Exception obj)
        {
            System.out.println("Exception Occured:"+obj);
        }  
    }
       
}


