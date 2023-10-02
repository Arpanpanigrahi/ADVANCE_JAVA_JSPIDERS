package jdbc_003;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

// Transactions are something which we are making changes in the table like insert, delete and update
public class TransCheck {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_003?user=root&password=Arpan@7219193146");
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		String sql1 = "INSERT INTO trainers VALUES(10, 'ARPAN', 'SQL', 'male')";
		String sql2 = "INSERT INTO trainers VALUES(11, 'BALAJI', 'JS', 'male')";
		String sql3 = "INSERT INTO trainers VALUES(13, 'ARPAN', 'SQL', 'male')";
		st.execute(sql1);
		st.execute(sql2);
		con.rollback();
		st.execute(sql3);
		con.commit(); //yes we can perform commit explicitly
		con.close();
		
		System.out.println("success");
	}
}
