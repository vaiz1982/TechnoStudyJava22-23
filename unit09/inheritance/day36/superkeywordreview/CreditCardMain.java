package unit09.inheritance.day36.superkeywordreview;

public class CreditCardMain {
    public static void main(String[] args) {
        CreditCard creditCard =
                new CreditCard();
        creditCard.transaction(100);
        creditCard.info();
        creditCard.transaction(20);
        creditCard.info();
        creditCard.transaction(13.25);
        creditCard.info();

        System.out.println("=====Reward Card Transactions====");
        RewardCard rewardCard = new RewardCard();
        rewardCard.transaction(99.69);
        rewardCard.info();
        rewardCard.transaction(12.56);
        rewardCard.info();

        System.out.println("=====Reward Card 2 Transactions====");
        RewardCard rewardCard2 = new RewardCard(1000, 0.03, 30);
        rewardCard2.transaction(100);
        rewardCard2.info();
        rewardCard2.transaction(200);
        rewardCard2.info();
    }
}
