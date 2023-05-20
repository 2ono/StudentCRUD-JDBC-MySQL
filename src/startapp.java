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
			
			
		}
	}
}
