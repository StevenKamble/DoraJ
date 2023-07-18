import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
        Socket s=new Socket("localhost",3124);
        
        DataInputStream in=new DataInputStream(s.getInputStream());
        DataOutputStream out=new DataOutputStream(s.getOutputStream());
        
        String str1="",str2="";
        while(!str2.equals("bye"))
        {
            str1=sc.next();
            out.writeUTF(str1);
            out.flush();
            
            str2=in.readUTF();
            System.out.println(str2);
        }
         }
         catch(Exception e)
         {
          System.out.println(e);  
          }
    }
}
