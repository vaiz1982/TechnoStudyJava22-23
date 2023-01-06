package unit09.inheritance.day36.superkeywordreview;
/*CreditCard class
private double balance
public void transaction(double amount) -> increases the balance by the amount*/
public class CreditCard {
    private double balance;

    public CreditCard(double balance) {
        this.balance = balance;
    }

    public CreditCard() {

        balance = 0;
    }

    public void transaction(double amount){
        balance = balance + amount;
    }
    public void info(){
        System.out.println("Your balance: " + balance);
    }
    public double getBalance() {
        return balance;
    }


}
