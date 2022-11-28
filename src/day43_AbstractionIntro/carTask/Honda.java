package day43_AbstractionIntro.carTask;

public final class Honda extends Car {

    public Honda( String model, String color, int year, double price) {
        super("Honda", model, color, year, price);
    }


    @Override
    public void start() {
        System.out.println(getBrand()+ " " +getModel()+ "Twist the key to the ignition");
    }
}
