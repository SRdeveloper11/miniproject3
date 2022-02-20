package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question7 {

	public void info() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q=" SELECT DISTINCT Studentproject.ST_NO ,student.ST_Name, ST_DOB, ST_DOj  from\r\n"
		 		+ "		 		Student , Studentproject\r\n"
		 		+ "		 		WHERE Studentproject.DESIGNATION=\"PROGRAMMER\"\r\n"
		 		+ "		 		AND student.ST_NO=Studentproject.ST_NO;";
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   if(rs.next()){ 
				do{
				System.out.println("Student No:"+rs.getString(1)+"     Studnet Name:"+rs.getString(2)+"          Student DOB:"+rs.getString(3)+"        Student DOJ:"+rs.getString(4));
			}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			conn.close();
	}
	}


