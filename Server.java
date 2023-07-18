import java.io.*;
import java.net.*;
import java.util.*;
public class Server
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            ServerSocket ss=new ServerSocket(3124);
            Socket s=ss.accept();
            
        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        
        String str1="",str2="";
        
        while(!str2.equals("bye"))
        {
            str2=in.readUTF();
            System.out.println(str2);
            
            str1=sc.next();
            out.writeUTF(str1);
            out.flush();

        }
         }
         catch(Exception e)
         {
          System.out.println(e);  
          }
    }
}
