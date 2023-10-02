package jdbc_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestExecuteQuery {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_002","root","Arpan@7219193146");
		Statement st = con.createStatement();
		String sql = "SELECT * FROM car";
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println("-------------------------------");
		}
		con.close();
	}
}
