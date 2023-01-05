package unit09.inheritance.day35.constructorReview;

public class PowerTool extends Tool{
    private String powerAdapter;

    public PowerTool(String name, String brand, String powerAdapter) {
        super(name, brand);
        this.powerAdapter = powerAdapter;
    }

    public String getPowerAdapter() {
        return powerAdapter;
    }

    public void setPowerAdapter(String powerAdapter) {
        this.powerAdapter = powerAdapter;
    }
}
