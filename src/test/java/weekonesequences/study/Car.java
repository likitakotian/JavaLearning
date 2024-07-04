package weekonesequences.study;

public class Car extends Vehicle{

    private String brand = "Car Windshield";

    @Override
    protected void honk() {
        super.honk();
    }

    @Override
    protected void run() {
        drive();
    }


    private void drive(){
        System.out.println("Car Drive");
    }

}
