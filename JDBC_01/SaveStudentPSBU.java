import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveStudentPSBU {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_001","root","Arpan@7219193146");
		
		//Query for pre compilation
		String sql = "INSERT INTO student VALUES(? , ? , ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		//adding data to ps
		ps.setInt(1, 103);
		ps.setString(2, "YASH");
		ps.setInt(3, 30);
		
		//transfer the data to the database
		ps.addBatch();
		
		//adding data to ps
		ps.setInt(1, 106);
		ps.setString(2, "VIJAY");
		ps.setInt(3, 35);
		
		//transfer the data to the database
		ps.addBatch();
		
		//transfer the data to database
		ps.addBatch();
		
		//adding data to ps
		ps.setInt(1, 105);
		ps.setString(2, "SAMPU");
		ps.setInt(3, 38);
		
		//transfer the data to database
		ps.addBatch();
		
		//execute batch
		ps.executeBatch();
		
		con.close();
		
		System.out.println("data inserted successfully");
	}
}
