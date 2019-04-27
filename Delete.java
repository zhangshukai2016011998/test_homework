
import java.util.Scanner;

public class Delete {
	private String name;
	
	public Delete() {
		Scanner scan=new Scanner(System.in);
		name=scan.nextLine();
	}
	
	public String getName() {
		return name;
	}

}
