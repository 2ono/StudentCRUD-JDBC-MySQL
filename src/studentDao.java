import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class studentDao {

	public static boolean insertStudentToDB(student st) throws ClassNotFoundException, IOException {
		
		//jdbc code...
		boolean f=false;
		try {
			
			Connection con = CP.createC();
			String q = "insert into stud(name, phone) values(?,?)";
			
			
			// preparedStatement
			PreparedStatement psmt = con.prepareStatement(q);
			
			// set the value of parameters
			psmt.setString(1, st.getStudentname());
			psmt.setString(2, st.getStudentphone());
			
			// execute...
			psmt.executeUpdate();
			f=true;
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
		
	}
}
