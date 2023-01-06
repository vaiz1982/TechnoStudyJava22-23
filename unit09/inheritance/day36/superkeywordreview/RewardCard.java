package unit09.inheritance.day36.superkeywordreview;

public class RewardCard extends CreditCard {
    private double rewardRate;
    private double rewardBalance;

    public RewardCard() {
        rewardBalance = 0;
        rewardRate = 0.01;
    }
    public RewardCard(double balance, double rewardRate, double rewardBalance) {
        super(balance);
        this.rewardRate = rewardRate;
        this.rewardBalance = rewardBalance;
    }

    @Override
    public void transaction(double amount) {
        super.transaction(amount);
        rewardBalance = rewardBalance + rewardRate * amount;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Your cashback amount is: " + rewardBalance);
    }
}
