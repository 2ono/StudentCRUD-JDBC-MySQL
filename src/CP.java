import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
//	List<String> lines = Files.readAllLines(Paths.get(""));

	static Connection con;

	public static Connection createC() throws ClassNotFoundException, SQLException, IOException {
		
		//load driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create connection
			FileSqlReader fr = new FileSqlReader();
			String user = fr.getFile(1);
			String password = fr.getFile(2);
			String url = fr.getFile(0);
			con = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
	}
}
