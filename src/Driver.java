import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Driver {

	public static void main(String[] args) throws IOException {
		
		Id_System user_base = new Id_System(); 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		
		/*reads input*/
		System.out.println("Enter names one by one followed by an empty enter to terminate input");
		while(true) {
			line = br.readLine();
			if(line==null || line.isEmpty()) {
				break;
			}
			if(line.matches("^[a-zA-Z]*$"))
				user_base.addUser(line);
			else
				System.out.println(("Error! Names must contain only letters")); 
		}
		user_base.print();
		
	}
	
	
}
