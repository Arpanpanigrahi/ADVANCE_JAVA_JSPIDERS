import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePerson {
	public static void main(String[] args) throws Exception{
		//Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		//Create Statement
		Statement st = con.createStatement();
		
		//Create and Execute the query
		//String sql = "INSERT INTO person VALUES(1, 'DIMPLE', 10 , 'female')";
		String sql = "DELETE FROM person where id=1";
		st.execute(sql);
		
		//close the costly resources
		con.close();
		
		System.out.println("data inserted successfully");
	}
}
