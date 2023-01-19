package unit11.collections.day42.sortingListByComparable;

public class SaleNumbers {
    private int numberOfSoldItems;
    private double totalRevenue;

    public SaleNumbers(int numberOfSoldItems, double totalRevenue) {
        this.numberOfSoldItems = numberOfSoldItems;
        this.totalRevenue = totalRevenue;
    }

    public int getNumberOfSoldItems() {
        return numberOfSoldItems;
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }

    @Override
    public String toString() {
        return "SaleNumbers{" +
                "numberOfSoldItems=" + numberOfSoldItems +
                ", totalRevenue=" + totalRevenue +
                '}';
    }
}
