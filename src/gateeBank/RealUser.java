package gateeBank;

public class RealUser extends User{
	
	private String id;
	
	public RealUser(String userNumber, String name, String email, Float balance, String id) {
		super(userNumber, name, email, balance);
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(String.valueOf(id).length() < 10) {
			System.out.println("Incorrect id");
		} else {
			this.id = id;
		}
	}
	
	@Override
	public void showDetails() {
		System.out.println("Account Type : Real User");
		System.out.println("User Number: " + userNumber);
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Balance: " + balance);
		
	}

	@Override
	public void withdraw(Float amount) {
		
		if(amount > balance) {
			System.out.println("Insufficient balance!");
		} else {
			balance = (float) (balance - amount - 0.05*amount);
			System.out.println("Withdrawal successful");
		}
	}

	@Override
	public void deposit(Float amount) {
		balance = (float) (balance + amount + 0.01*amount);
		System.out.println("Deposit successful");
	}
}
