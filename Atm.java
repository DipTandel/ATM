//ATM
//ICS4U1, Dip Tandel
//Oct 22, 2021

public class Atm {
  //instance variables
  private double balance;
  
  //mutator methods
  public void deposit(double money) {
    balance = balance + money;
  }
  public void withdraw(double money) {
    balance = balance - money;
    if (balance < 0) {
      System.out.println(":( You broke");
    }
  }
  public void billPayment(double money) {
    balance = balance - money;
    System.out.println("Bill paid successfully");
  }
  public void etranfer(double money) {
    balance = balance - money;
    System.out.println("Money sent");
  }
  public void printReceipt() {
    System.out.println("Your transaction ");
  }
  public void payDebt(double money) {
    balance = balance + money;
    System.out.println("you are an adult now");
  }
}