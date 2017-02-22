

public class Customer {

// Customer class has three fields
  public String name;
  public int age;
  public int wallet;

// Customer class has one constructor
  public Customer(String name, int age, int wallet) {
    this.name = name;
    this.age = 25;
    this.wallet = 0;
  }

// Customer class has four methods
  
  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public int getWalletAmount() {
    return this.wallet;
  }

  public void withdrawCash( int cash, Atm atm) {
    
  }
}