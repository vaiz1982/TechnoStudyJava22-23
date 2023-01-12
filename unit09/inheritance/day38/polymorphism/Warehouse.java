package unit09.inheritance.day38.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public static void main(String[] args) {
        ArrayList<Mail> shipments =
                new ArrayList<>(List.of(new Mail(10),new FastMail(3),new FastMail(4), new Mail(2)));

        double totalShipmentCost = 0;

        Mail mail1  = new Mail(4);
        Mail mail2 = new Mail(4);
        System.out.println(mail1.equals(mail2));

        for (Mail mail :shipments) {
            System.out.println(mail);
            totalShipmentCost = totalShipmentCost + mail.calculateShipping();
        }

        System.out.println("The total shipment cost is: " + totalShipmentCost);
    }
}
