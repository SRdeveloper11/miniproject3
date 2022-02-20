package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question10 {

	public void display() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q="SELECT  DISTINCT  student.ST_NO,ST_Name,  ST_DOB,  ST_DOJ\r\n"
		 		+ "FROM student, Studentproject \r\n"
		 		+ "where Studentproject .PRJ_NO =\"P03\"\r\n"
		 		+ "AND student.ST_NO=Studentproject.ST_NO;";
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   if(rs.next()){ 
				do{
				System.out.println("Student No:"+rs.getString(1)+"     Studnet Name:"+rs.getString(2)+"          Student DOB:"+rs.getString(3)+"        Student DOJ:"+rs.getString(4) );
			}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			conn.close();
	}

}
