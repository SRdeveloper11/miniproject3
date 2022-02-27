package miniproject3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class Question8 {

	public void maximum() throws SQLException {
		// TODO Auto-generated method stub
		String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";
		 String s1 = "select st_no,count(distinct (designation)) from studentproject group by st_no,prj_no;";
			Connection conn = DriverManager.getConnection(dbURL,username,password);
			Statement st1 = conn.createStatement();
			ResultSet rs1 = st1.executeQuery(s1);
			HashMap <String,Integer> l = new HashMap <String,Integer>();
			int flag=1;
			String a = null;
			int b = 0;
			while(rs1.next())
			{
				if(flag==1)
				{
					 a= rs1.getString(1);
					 b = rs1.getInt(2);
					 l.put(a, b);
					flag=0;
				}
				else if(a.equalsIgnoreCase(rs1.getString(1)) && flag==0)
				{
					if(b<rs1.getInt(2))
					{
						b=rs1.getInt(2);
						l.replace(a, b);
					}
					flag=1;
					
				}
				else
				{
					l.put(rs1.getString(1),rs1.getInt(2));
				}
					
			}
			int maxValueInMap=(Collections.max(l.values()));  
	        for (java.util.Map.Entry<String, Integer> entry : l.entrySet()) {  
	            if (entry.getValue()==maxValueInMap) {
	                System.out.println(entry.getKey() + "\t" +entry.getValue());
	              
	            }
	        }
			
		}	 
		 
	}
	


