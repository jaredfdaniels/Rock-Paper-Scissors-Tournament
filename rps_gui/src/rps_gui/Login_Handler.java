package rps_gui;
import java.util.*;
import java.io.*;

public class Login_Handler {
	HashMap<String,Object> credentials_map;
	
	public Login_Handler() {
		try{
			File credentials = new File ("credentials.txt");
			FileInputStream f = new FileInputStream(credentials);
			ObjectInputStream s = new ObjectInputStream(f);
			credentials_map = (HashMap<String,Object>)s.readObject();
			s.close();
			
		}
		catch(Exception ex){
			System.out.print("File not found");
		};
	}
	
	public Boolean check_username(String username){
		return credentials_map.containsKey(username);
	}
	
	public Boolean check_password(String username, String password) {
		if (credentials_map.containsKey(username) && credentials_map.get(username).equals(password))
			return true;
		else if (!credentials_map.containsKey(username)) {
			add_user(username, password);
			return true;
		}
		return false;
	}
	
	public void add_user(String username, String password) {
		credentials_map.put(username, password);
		update_credentials();
	}
	
	public void update_credentials () {
		try{
			File credentials = new File ("credentials.txt");
			FileOutputStream f = new FileOutputStream(credentials);
			ObjectOutputStream s = new ObjectOutputStream(f);
			s.writeObject(credentials_map);
			s.flush();
			s.close();
			
		}
		catch(Exception ex){
			System.out.print("File not found");
		};
	}
	
}
