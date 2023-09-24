import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveStudent {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		Statement st = con.createStatement();
		
		String sql = "INSERT INTO student VALUES(11, 'RAJU' , 'male')";
		
		st.execute(sql);
		
		con.close();
		
		System.out.println("data inserted successfully");
	}
}
