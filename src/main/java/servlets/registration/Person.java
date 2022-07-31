package servlets.registration;

public class Person {
	private String username;
	private String password;

	public Person(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public boolean isPasswordValid(String password) {
		return this.password.equals(password);
	}
}