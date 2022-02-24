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
		 String q="\"select * from student where st_no in\"\r\n"
		 		+ "				+ \"(select st_no from studentproject where prj_no in\"\r\n"
		 		+ "				+ \"(select prj_no from studentproject group by prj_no having count(distinct(st_no))=3\"\r\n"
		 		+ "				+ \"))\";";
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
