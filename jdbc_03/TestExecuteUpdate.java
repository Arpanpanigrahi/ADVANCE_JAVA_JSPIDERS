package jdbc_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestExecuteUpdate {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_002?user=root&password=Arpan@7219193146");
		Statement st = con.createStatement();
		String sql = "UPDATE car SET price = price+50000 WHERE price > 200000";
		int res = st.executeUpdate(sql);
		System.out.println(res);
		con.close();
	}
}
