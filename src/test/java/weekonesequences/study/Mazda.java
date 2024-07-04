package weekonesequences.study;

public class Mazda extends Car {

    protected static String WINDSHIELD_BRAND = "mazda windshiield";
    private Boolean isAutomatic = true;

    public Boolean getAutomatic() {
        return isAutomatic;
    }

    @Override
    protected void run() {
        super.run();
        System.out.println("Mazda Drive");
    }

    protected void run(int speed) {
        super.run();
        System.out.println("Mazda Drive with Speed");
    }
}
