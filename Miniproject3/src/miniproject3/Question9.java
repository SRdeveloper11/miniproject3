package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question9 {

	public void youngest() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q="select* From student where student.ST_DOB=(SELECT MAX(student.ST_DOB)  From student)";
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
