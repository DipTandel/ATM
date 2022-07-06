//AtmMain
//ICS4U1, Dip Tandel
//Oct 22, 2021

public class AtmMain {
  public static void main (String[] args) {
    
    //creating a atm object
    Atm a1 = new Atm();
    a1.deposit(300);
    a1.printReceipt();
    a1.withdraw(7);
    a1.printReceipt();
    a1.withdraw(2000);
    a1.printReceipt();
  }
}