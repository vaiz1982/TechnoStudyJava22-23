package unit12.exceptions.day47.customException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws Exception {
        if(amount > balance){
            /*throw new RuntimeException();*/
            /*throw new Exception("Insufficient Balance.");*/
            throw new InsufficientBalanceException("You have no enough balance.");
        }
        balance = balance - amount;
        System.out.println("The withdrawal of $" + amount+ " is successful." );
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
