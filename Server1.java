import java.io.*;
import java.net.*;
public class Server1
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss=new ServerSocket(3124);
            Socket s=ss.accept();
            
        DataInputStream in=new DataInputStream(s.getInputStream());
        
        String str1="";
        
            str1=in.readUTF();
            System.out.println(str1);
                  
         }
         catch(Exception e)
         {
          System.out.println(e);  
          }
    }
}
