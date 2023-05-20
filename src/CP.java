import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
	static Connection con;
	
	public static Connection createC() throws ClassNotFoundException, SQLException {
		//load driver
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection
			String user = "test11";
			String password = "asdf1020";
			String url = "jdbc:mysql://3.34.179.232:3306/student";
			con = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
