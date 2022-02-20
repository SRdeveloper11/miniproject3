package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question5 {

	public void displaystudent() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q="SELECT  count(*) ST_NO\r\n"
		 		+ "FROM student\r\n"
		 		+ "WHERE ST_NO NOT IN\r\n"
		 		+ "    (SELECT ST_NO \r\n"
		 		+ "     FROM  Studentproject ) ";
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   rs.next();
		      int count = rs.getInt(1);
		      System.out.println("Number of Students did not participate in any project: "+count);
	}

}
