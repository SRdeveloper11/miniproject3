package miniproject3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Question6 {

	public void details() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	
		 String q="SELECT DISTINCT \r\n"
		 		+ "       Student.st_no,st_name,\r\n"
		 		+ "        CONCAT\r\n"
		 		+ "        (\r\n"
		 		+ "            FLOOR((TIMESTAMPDIFF(MONTH,  ST_DOB, CURDATE()) / 12)), ' YEARS '\r\n"
		 		+ "        ) AS age\r\n"
		 		+ "        FROM  student,Studentproject\r\n"
		 		+ "         WHERE Studentproject.PRJ_NO=\"P02\"\r\n"
		 		+ "		 		AND student.ST_NO=Studentproject.ST_NO;";
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		 Statement smt=conn.createStatement();
		   ResultSet rs=smt.executeQuery(q);
		   if(rs.next()){ 
				do{
				System.out.println("Student No:"+rs.getString(1)+"     Studnet Name:"+rs.getString(2)+"       Student Age:"+rs.getString(3)   );
			}while(rs.next());
			}
			else{
				System.out.println("Record Not Found...");
			}
			conn.close();
	}
}
