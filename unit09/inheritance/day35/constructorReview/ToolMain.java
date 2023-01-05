package unit09.inheritance.day35.constructorReview;

public class ToolMain {
    public static void main(String[] args) {
        BatteryPoweredTool drill =
                new BatteryPoweredTool("Drill","Dewalt","5 Amp Adapter", 200);
        System.out.println("Tool: " + drill.getName() + "\nBrand: "+drill.getBrand()
        +"\nAdapter: " + drill.getPowerAdapter() + "\nWatt: " +drill.getBatteryWatt());
    }
}
