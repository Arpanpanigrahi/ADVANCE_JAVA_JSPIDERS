package jdbc_003;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class SaveTrainer {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_003?user=root&password=Arpan@7219193146");
		CallableStatement cs = con.prepareCall("{ call save(6 , 'UTSAV' , 'JAVASCRIPT' , 'male') }");
		
		int res = cs.executeUpdate();
		System.out.println(res);
		con.close();
	}

}
