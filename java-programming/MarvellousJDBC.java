import java.sql.*;
public class MarvellousJDBC
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MarvellousPPA","root","");

            Statement stmt =con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while(rs.next())
            {
                System.out.println("Roll number:"+rs.getInt("rno"));

                System.out.println("Name :"+rs.getString("name"));

                System.out.println("city :"+rs.getString("city"));

                System.out.println("Marks:"+rs.getString("marks"));


            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured"+e);
        }  

    }
    
}




////////////////////for jar file checking==> cd C:\Users\Dell\Downloads\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0.jar

//////////////// for compile ==>javac -cp ".;C:\Users\Dell\Downloads\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0.jar" MarvellousJDBC.java
/// 
/// 
/// ////////////for run ===>>>java -cp ".;C:\Users\Dell\Downloads\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0\mysql-connector-j-9.3.0.jar" MarvellousJDBC
