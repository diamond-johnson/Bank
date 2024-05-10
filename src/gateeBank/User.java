package gateeBank;

public abstract class User {
	protected String userNumber;
	protected String name;
	protected String email;
	protected Float balance;
	
	public User(String userNumber, String name, String email, Float balance) {
		this.userNumber = userNumber;
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public abstract void showDetails();
	public abstract void withdraw(Float amount);
	public abstract void deposit(Float amount);
}
