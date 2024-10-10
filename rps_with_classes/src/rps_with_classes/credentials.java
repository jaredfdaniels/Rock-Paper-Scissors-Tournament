package rps_with_classes;
import java.util.Scanner;

public class credentials {
	public String username;
	public String password;
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.print("Login | Choose a username: ");
		username = reader.next();
		// Check if name is already taken
		System.out.print("Name taken, enter password: ");
		password = reader.next();
		
	}

}
