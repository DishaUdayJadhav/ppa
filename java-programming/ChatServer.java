import java.io.*;
import java.net.*;

class ChatServer 
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Marvellous Server is Waiting At port number : 5100");

        Socket sobj = ssobj.accept();
        System.out.println("Marvellous Server Successfully Connected With the Client");

        PrintStream  pobj = new PrintStream(sobj.getOutputStream());

        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));

        pobj.println("Hello from Server");


        String str = bobj1.readLine();
        System.out.println("Message from Client :"+str);

    }    
}
