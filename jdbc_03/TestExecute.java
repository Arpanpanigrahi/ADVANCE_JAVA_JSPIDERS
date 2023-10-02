package jdbc_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestExecute {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_002?user=root&password=Arpan@7219193146");
		Statement st = con.createStatement();
		String sql = "SELECT * FROM car";
		boolean res = st.execute(sql);
		System.out.println(res);
		con.close();
	}
}
