import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchUpdation {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		Statement st = con.createStatement();
		
		String sql1 = "INSERT INTO student VALUES(5, 'AVINASH', 22)";
		String sql2 = "INSERT INTO student VALUES(6, 'RAVI', 21)";
		String sql3 = "INSERT INTO student VALUES(7, 'BHARAT', 19)";
		
		//creating batch of SQL queries
		st.addBatch(sql1);
		st.addBatch(sql2);
		st.addBatch(sql3);
		
		//executing batch of SQL queries
		st.executeBatch();
		
		con.close();
		
		System.out.println("data inserted successfully");
	}
}
