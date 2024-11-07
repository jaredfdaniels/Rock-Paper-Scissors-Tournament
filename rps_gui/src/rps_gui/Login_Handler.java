package rps_gui;
import java.util.*;
import java.io.*;

public class Login_Handler {
	
	public static String check_username(File source, String username) throws FileNotFoundException {
		Scanner reader = new Scanner(source);
		/*while (reader.hasNext()) {
			if (reader.findInLine(username) == username)
				break;
			else
				reader.skip();
		}*/
		if (reader.next() == username) {
			return("taken");
		}
		else{
			return("free");
		}
	}
	public void check_password() {
			
		}
	public void add_username() {
		
	}
	public void add_password() {
		
	}
	public void prompt_password() {
		
	}
}
