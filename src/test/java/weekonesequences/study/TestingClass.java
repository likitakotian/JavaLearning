package weekonesequences.study;

public class TestingClass {

    public static void main(String[] args) {
        Mazda mazda = new Mazda();
        mazda.getAutomatic();
        mazda.run();
        mazda.run(150);
        mazda.honk();
        String windshieldBrand = Mazda.WINDSHIELD_BRAND;
    }

}
