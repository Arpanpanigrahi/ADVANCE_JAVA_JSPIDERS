import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveStudentPS {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		//Query for pre compilation
		String sql = "INSERT INTO student VALUES(? , ? , ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//adding data to ps
		ps.setInt(1, 102);
		ps.setString(2, "KGF");
		ps.setInt(3, 40);
		
		//transfer the data to the database
		ps.execute();
		
		con.close();
		
		System.out.println("data inserted successfully");
	}
}
