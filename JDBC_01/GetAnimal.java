import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetAnimal {
	public static void main(String[] args) throws Exception{
		//Load and register the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Establish connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		//Create Statement
		Statement st = con.createStatement();
		
		//Create and Execute the query
		String sql = "SELECT * FROM animal";
		st.execute(sql);
		
		ResultSet rs = st.getResultSet();
		
		while(rs.next()) {
		int id = rs.getInt(1);
		String name = rs.getString(2);
		int legs = rs.getInt(3);
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(legs);
		}
		
		//close the costly resources
		con.close();
	}
}
