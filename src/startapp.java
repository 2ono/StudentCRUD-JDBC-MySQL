import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class startapp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("Welcome to Student Management App");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to Delete student");
			System.out.println("Press 3 to display student");
			System.out.println("Press 4 to exist app");
			int c = Integer.parseInt(br.readLine());

			if (c == 1) {
				// add students
				System.out.println("Enter your name..");
				String name = br.readLine();
				
				System.out.println("Enter your phone number..");
				String phone = br.readLine();
				
				// create student object to store student.
				student st = new student(name,phone);
				boolean answer = studentDao.insertStudentToDB(st);
				// check name and phone number
				System.out.println(st);
				
				if(answer) {
					System.out.println("Added Successfully to Database");
				}else {
					System.out.println("Sometjing went wrong....");
				}
				

			} else if (c == 2) {
				// delete students
				System.out.println("Enter student Id to delete...");
				int userId = Integer.parseInt(br.readLine());
				
				boolean answer = studentDao.deleteStudent(userId);
				
				if(answer) {
					System.out.println("Deleted ...");
				}else {
					System.out.println("Sometjing went wrong....");
				}

			} else if (c == 3) {
				// display
				studentDao.showAllStudent();

			} else if (c == 4) {
				// exist
				break;
			} else {

			}
		}
		System.out.println("Thank you for using my application");

	}
}
