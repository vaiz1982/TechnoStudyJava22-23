package unit12.exceptions.day47.customException;

public class BankMain {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(100);

        System.out.println(bankAccount);

        try {
            bankAccount.withdraw(80);
            bankAccount.withdraw(100);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(bankAccount);

    }
}
