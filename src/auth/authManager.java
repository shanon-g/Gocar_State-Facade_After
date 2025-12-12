package auth;

import java.util.HashMap;

public class authManager {
	
	private HashMap<String, String> users;

	public authManager() {
		this.users = new HashMap<String, String>();
	}

	public String register (String username, String password) { 
		if (users.containsKey(username)) {
			return "Username already exists!";
		}
		else {
			users.put(username, password);
			return "Registration successful for " + username + "!";
		}
	}
	
	public String login (String username, String password) { 
		if (users.containsKey(username)) {
			if (users.get(username).equals(password)) {
				return username; 
			}
			else {
				return "Invalid password!"; 
			}
		}
		else {
			return "Username not found!"; 
		}
	}

}
