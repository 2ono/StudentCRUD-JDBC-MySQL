import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class startapp {

	public static void main(String[] args) throws IOException {
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
				

			} else if (c == 2) {
				// delete students

			} else if (c == 3) {
				// display

			} else if (c == 4) {
				// exist
				break;
			} else {

			}
		}
		System.out.println("Thank you for using my application");

	}
}
