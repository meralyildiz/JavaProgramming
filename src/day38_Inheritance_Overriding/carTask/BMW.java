package day38_Inheritance_Overriding.carTask;

public class BMW extends Car {

    public BMW(String model, int year, double price, String colour, int miles) {
        super("BMW", model, year, price, colour, miles);
    }

    public void breaksdown() {
        System.out.println(brand + " " + model + " is breaking down");
    }

    public void racing() {
        System.out.println(brand + " " + model + " is a racing ca");
    }

    public void start() {
        System.out.println("Call mechanic to jump start " + brand + " " + model);
    }

}
/*
2. BMW:
					extra methods:
						breaksDown()
						racing()
 */