import java.io.*;
import java.net.*;
public class Client1
{
    public static void main(String args[])
    {
        try
        {
        Socket s=new Socket("localhost",3124);
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        
        String str1="Hello World";
   
            out.writeUTF(str1);
            out.flush();
        
         }
         catch(Exception e)
         {
          System.out.println(e);  
          }
    }
}
