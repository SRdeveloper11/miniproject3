package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question3 {

	 void Displayl() throws SQLException {
		// TODO Auto-generated method stub
		 String q="SELECT count(*) FROM Studentproject\r\n"
		 		+ "WHERE Studentproject.PRJ_NO=\"P01\";";
			String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
			 String username = "root";
			 String password = "shivam@123";	  
			  Connection conn = DriverManager.getConnection(dbURL, username, password);
			 Statement smt=conn.createStatement();
			   ResultSet rs=smt.executeQuery(q);
			   rs.next();
			      int count = rs.getInt(1);
			      System.out.println("Number of Students doing P01 project: "+count);
	}



}
