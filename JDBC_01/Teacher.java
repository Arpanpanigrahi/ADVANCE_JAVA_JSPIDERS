//package jdbc_001;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Teacher {

	public static void main(String[] args) throws Exception {
		
		boolean flag = true;
		
		while(flag) {
		System.out.println("---------------------------------------------------");
		System.out.println("press 1 to view teacher");
		
		System.out.println("press 2 to add teacher");
		
		System.out.println("press 3 to update teacher");
		
		System.out.println("press 4 to delete teacher");
		
		System.out.println("--------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
		
		switch (choice) {
		
		//view
		case 1:
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
			
			
			Statement st = con.createStatement();
			
			
			String sql = "SELECT * FROM teacher";
			
			st.execute(sql);
			
			ResultSet rs = st.getResultSet();
			
			while(rs.next()) {
			
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String gen = rs.getString(3);
			
			System.out.println("----------------------------------");
			System.out.println(id + " " + name + " " + gen);
			
			}
			
			con.close();
			break;
			
			//add
			
		case 2:
			
			Scanner sc1=new Scanner(System.in);
			System.out.println("---------------------------------------");
			System.out.println("please enter the id,name and gender");
			String id1=sc1.nextLine();
			String name1=sc1.nextLine();
			String gen=sc1.nextLine();
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
			 
			 Statement st1 = con1.createStatement();
			 
			 
			 
			 
			 String sql1 ="INSERT INTO teacher VALUES (" +id1+ "," + "'" +name1+ "'" + "," + "'" +gen+ "'" +")";
			 
			 try {
				 st1.execute(sql1);
				 System.out.println("----------------------------------------");
				 System.out.println("data inserted successfully");
			} catch (Exception e) {
				
				System.out.println("data already exists");
			}
			 
			 con1.close();
			 break;
		
			 
		//update
			 
		case 3:
			Scanner sc3=new Scanner(System.in);
			System.out.println("----------------------------------------");
			System.out.println("enter the new name and id");
			String s1=sc3.nextLine();
			int id2=sc3.nextInt();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con2= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
			
			Statement st2 = con2.createStatement();	
			
			String sql2 = "UPDATE teacher SET name ="+"'"+s1+"'"+" WHERE id= "+id2 ;
			
			st2.execute(sql2);
			
			
			con2.close();	
			System.out.println("-----------------------------------------");
			System.out.println("success");
			
			break;
		
		//delete
		case 4:
			Scanner sc4=new Scanner(System.in);
			System.out.println("------------------------------------------");
			System.out.println("enter the id u want to delete");
			String id = sc4.nextLine();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			Connection con3= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
			
			
			Statement st3 = con3.createStatement();
			
			
			String sql3 = "DELETE FROM teacher WHERE id = " +id+"";
			
			st3.execute(sql3);
			
			
			con3.close();	
			System.out.println("---------------------------------------------------------");
			System.out.println("success");
			
			break;
			
		default:
			break;
		}
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("press 1 to continue zero to exit");
		System.out.println("-----------------------------------------------------------");
		int i=sc.nextInt();
		
		if(i==0) {
			flag=false;
			
			}

		}
	}
}
