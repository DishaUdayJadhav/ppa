import java.io.*;


class FileIO1 
{
    public static void main(String[] args)  throws Exception
    {
       File fobj = new File("Marvellous .txt");
       
       if (fobj.createNewFile())
       {
            System.out.println("File is Successfully Created");
            FileWriter fwobj = new FileWriter("Marvellous.txt");
            int ret = fwobj.write("Pre-Placement Activity Batch 52");
            System.out.println(ret);
       }
       else
       {
            System.out.println("Unable to create file");
       }

    }
}
