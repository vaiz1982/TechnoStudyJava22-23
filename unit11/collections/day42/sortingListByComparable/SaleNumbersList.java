package unit11.collections.day42.sortingListByComparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SaleNumbersList {
    public static void main(String[] args) {
        List<SaleNumbers> saleNumbersList
                = new ArrayList<>();
        saleNumbersList.add(new SaleNumbers(50, 1234.53));
        saleNumbersList.add(new SaleNumbers(60, 1000.3));
        saleNumbersList.add(new SaleNumbers(30, 601.33));
        saleNumbersList.add(new SaleNumbers(90, 3500.00));

        /*sort by number of items sold
        * sort by the total revenue*/
        saleNumbersList.sort(Comparator.comparing(SaleNumbers::getNumberOfSoldItems));
        System.out.println(saleNumbersList);

        System.out.println("Sort by Revenue");
        saleNumbersList.sort(Comparator.comparing(SaleNumbers::getTotalRevenue));
        System.out.println(saleNumbersList);
    }
}
