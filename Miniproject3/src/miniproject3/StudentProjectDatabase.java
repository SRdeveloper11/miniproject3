package miniproject3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class StudentProjectDatabase {
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 String dbURL = "jdbc:mysql://localhost/studentprojectdatabase";
		 String username = "root";
		 String password = "shivam@123";	  
		  Connection conn = DriverManager.getConnection(dbURL, username, password);
		
		  
	
	System.out.println(" 1-To display list of all student"+" \n"+ " 2-To display list of all projects"+" \n"+
	 " 3-To display the number of students who are working on project “P01”"+" \n"+" 4- To display number of students who participated in more than one project."
			+"\n"+ " 5- To find number of students who did not participate in any project"+" \n"+" 6- To	display the information(no,name,age) of student  who made the project in java"
	 +" \n"+" 7-To display the student information who is a programmer"+" \n"+" 8-To display the student who played the max designation(e.g. manager,programmer) in the same project"+"\n"+
			" 9-To display details of the youngest student"+" \n"+" 10-To display the info of the student who participated in the project where total no of the student should be exact three");
	 Scanner sc=new Scanner(System.in);
	 do
	 {
	 System.out.println("Enter the Choice:");
	int Choice=sc.nextInt();
	switch(Choice)
	{
	case 1:
		Question1 q1=new  Question1();
	 q1.Displaystudent1();
	break;
	case 2:
		Question2 q2=new  Question2();
	q2.Displayproject();
	break;
	case 3:
		Question3 q3=new Question3();
	q3.Displayl();
	break;
	case 4: 
		Question4 q4=new Question4 ();
		q4.display();
		break;
	case 5:
		Question5 q5=new  Question5();
		q5.displaystudent();
		 break;
	case 6:
		Question6  q6=new Question6();
		q6.details();
		break;
	case 7:
		Question7 q7=new Question7();
		q7.info();
		break;
	case 8:
		 Question8 q8=new  Question8();
		 q8.maximum();
		 break;
	case 9:
		 Question9 q9=new  Question9();
		 q9.youngest();
		 break;
	case 10: Question10 q10=new  Question10();
	q10.display();
		break;
		default:System.out.println("Enter a valid choice");
	}
	    System.out.println("Do you want to continue: y/n"); 
	    String s=sc.next(); 
	    if(s.startsWith("n")){ 
	    break; 
	 }
	}while(true);
}
}


