package gateeBank;

import java.util.concurrent.CopyOnWriteArrayList;

public class Bank {
	
	CopyOnWriteArrayList<User> users;
	
	public Bank() {
		users = new CopyOnWriteArrayList<User>();
	}
	
	public CopyOnWriteArrayList<User> getUsers() {
		return users;
	}
	public void setUsers(CopyOnWriteArrayList<User> users) {
		this.users = users;
	}
	
	public void addUser(User testUser) {
		if(users.size() == 0) {
			users.add(testUser);
			System.out.printf("User {%s} added", testUser.userNumber);
			System.out.println();
		} 
		else if(users.size() > 0) {
			int temp = 0;
			for(User user : users) {
				if(user.getUserNumber().equals(testUser.userNumber) == true) {
					System.out.println("User already exists");
					temp = 1;
					break;
				}
			}
			if(!(temp == 1)) {
				users.add(testUser);
				System.out.printf("User {%s} added", testUser.userNumber);
				System.out.println(); 
			}
		}
	}	
	public void deleteUser(String userNumber) {
		int temp = 0;
		for(User user : users) {
			if(user.getUserNumber().equals(userNumber) == true) {
				System.out.printf("User {%s} deleted", userNumber);
				System.out.println();
				temp = 1;
				for(User user1 : users) {
					if(user1.getUserNumber().equals(userNumber)) {
						users.remove(user1);
					}
				}
				break;
			}
		}
		if (!(temp == 1)) {
			System.out.println("User doesn't exist");
		 }
	}
	
	public void showBankBalance() {
		int bankBalance = 0;
		for(User user2 : users) {
			bankBalance += user2.getBalance();
		}
		System.out.println("Total balance of the bank is: " + (float)bankBalance);
	}
}