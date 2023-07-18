 import java.sql.*;
 import java.lang.*;
public class pro7

{
   public static void main(String args[])throws Exception
   {
       Class.forName("oracle.jdbc.driver.OracleDriver");
       
       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123");
       
       String sql="select * from book_turf";
       
       PreparedStatement st=con.prepareStatement(sql);
       ResultSet rs=st.executeQuery();
       
       System.out.println("Email"+ "\t"+"Add"+"\t"+"time"); 
       
       while(rs.next())
       {
          System.out.println(rs.getString("email")+"\t"+rs.getString("address")+"\t"+rs.getString("time")); 
        }
   }
}


