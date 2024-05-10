package gateeBank;

public class Main {

  public static void main(String[] args) {

      Bank bank = new Bank();

      RealUser realUser = new RealUser("123", "Sina Moradi", "sina.moradi@gmail.com", 1000.0f, "0200000000");

      LegalUser legalUser = new LegalUser("124", "Snapp Food", "contact@snappfood.com", 100000.0f, "Tehran, Zaferanieh");

      System.out.println("--------------------");

      bank.addUser(realUser);
  
      System.out.println("--------------------");

      bank.addUser(legalUser);

      System.out.println("--------------------");

      bank.addUser(legalUser);

      System.out.println("--------------------");

      bank.showBankBalance();

      System.out.println("--------------------");

      bank.getUsers().getFirst().showDetails();

      System.out.println("--------------------");

      bank.getUsers().getLast().showDetails();

      System.out.println("--------------------");

      bank.getUsers().getFirst().withdraw(100.0f);

      System.out.println("--------------------");

      bank.showBankBalance();

      System.out.println("--------------------");

      bank.getUsers().getLast().withdraw(1000.0f);

      System.out.println("--------------------");

      bank.showBankBalance();

      System.out.println("--------------------");

      bank.getUsers().getFirst().deposit(100.0f);

      System.out.println("--------------------");

      bank.showBankBalance();

      System.out.println("--------------------");

      bank.getUsers().getLast().deposit(1000.0f);

      System.out.println("--------------------");

      bank.showBankBalance();

      System.out.println("--------------------");
      
      bank.deleteUser("123");
      
      System.out.println("--------------------");

      bank.deleteUser("123");

      System.out.println("--------------------");

      bank.showBankBalance();

  }

}