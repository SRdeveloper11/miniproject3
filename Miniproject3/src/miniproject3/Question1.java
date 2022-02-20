package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Question1{

	public void Displaystudent1() throws SQLException {
	// TODO Auto-generated method stub
		String q="select*from student";
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   if(rs.next()){ 
				do{
				System.out.println("Student No:"+rs.getString(1)+"     Studnet Name:"+rs.getString(2)+"      Date:"+rs.getString(3)+"    Date:"+rs.getString(4));
				}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			conn.close();
		}
}
	
