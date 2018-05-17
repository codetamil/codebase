package Encapsulation;

public class SecureClass {
	
	private String username,password;

	protected String getUsername() {
		return username;
	}

	protected void setUsername(String username) {
		this.username = username;
	}

	protected String getPassword() {
		return password;
	}

	 protected void setPassword(String password) {
		this.password = password;
	}

}
