package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question8 {

	public void maximum() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q="SELECT MAX(student.ST_Name) from\r\n"
		 		+ "Student , Studentproject\r\n"
		 		+ "WHERE Studentproject.DESIGNATION=\"PROGRAMMER,MANAGER\"\r\n"
		 		+ "AND student.ST_NO=Studentproject.ST_NO;";
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   if(rs.next()){ 
				do{
				System.out.println("  Studnet Name:"+rs.getString(1)  );
			}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			conn.close();
	}
	}


