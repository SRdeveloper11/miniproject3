package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question4 {

	public void display() throws SQLException {
		// TODO Auto-generated method stub
		 String q="SELECT   student.ST_NO\r\n"
		 		+ "FROM student, Studentproject \r\n"
		 		+ "HAVING COUNT(PRJ_NO)>1;";
			String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
				 String username = "root";
				 String password = "shivam@123";	  
				  Connection conn = DriverManager.getConnection(dbURL, username, password);
				 Statement smt=conn.createStatement();
				   ResultSet rs=smt.executeQuery(q);
				   int count=0;
				 while(  rs.next())
				 {
					 count++;
				 } 
			    System.out.println("Number of Students participated in more than one project: "+count);
	}

}
