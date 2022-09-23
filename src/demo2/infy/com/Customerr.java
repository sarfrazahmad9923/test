package demo2.infy.com;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Customerr {
   public static void main(String[] args) {
       Connection con = null;
       ResultSet rs = null;
       try {
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatedb,root,root");
           Statement stmnt = con.createStatement();
           rs = stmnt.executeQuery("select * from employee");
           if (rs.next())
               System.out.println(rs.getString(1));//line 1
               System.out.println(rs.getString(2));
               System.out.println(rs.getString(3));
           } catch (SQLException e) {
           e.printStackTrace();
       }
   }
}
	

		 

	



