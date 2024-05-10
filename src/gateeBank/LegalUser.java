package gateeBank;

public class LegalUser extends User{
	
	private String CompanyAddress;
	
	public LegalUser(String userNumber, String name, String email, Float balance, String CompanyAddress) {
		super(userNumber, name, email, balance);
		this.CompanyAddress = CompanyAddress;
	}
	
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String CompanyAddress) {
		this.CompanyAddress = CompanyAddress;
	}
	
	@Override
	public void showDetails() {
		System.out.println("Account Type : Legal User");
		System.out.println("User Number: " + userNumber);
		System.out.println("Company Address: " + CompanyAddress);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Balance: " + balance);	
	}
	

	@Override
	public void withdraw(Float amount) {
		
		if(amount > balance) {
			System.out.println("Insufficient balance!");
		} else {
			balance = (float) (balance - amount - 0.03*amount);
			System.out.println("Withdrawal successful");
		}
	}

	@Override
	public void deposit(Float amount) {
		balance = (float) (balance + amount + 0.02*amount);
		System.out.println("Deposit successful");
	}
}
