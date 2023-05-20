import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class studentDao {

	public static boolean insertStudentToDB(student st) throws ClassNotFoundException, IOException {

		// jdbc code...
		boolean f = false;
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
			f = true;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;

	}

	public static boolean deleteStudent(int userId) throws ClassNotFoundException, IOException {
		boolean f = false;
		try {
			Connection con = CP.createC();
			String q = "delete from stud where id=?";

			// preparedStatement
			PreparedStatement psmt = con.prepareStatement(q);

			// set the value of parameters
			psmt.setInt(1, userId);

			psmt.executeUpdate();
			f = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudent() throws ClassNotFoundException, IOException {
		boolean f=false;
		try {
			Connection con = CP.createC();
			String q = "select * from stud;";

			// preparedStatement
			Statement stmt = (Statement) con.createStatement();
			stmt.executeQuery(q);
			
			java.sql.ResultSet set=stmt.executeQuery(q);
			
			while(set.next()) {
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				
				System.out.println("ID : " + id);
				System.out.println("Name : " + name);
				System.out.println("Phone : " + phone);
				System.out.println("==========================");
			}
			
			f=true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
	}
}
