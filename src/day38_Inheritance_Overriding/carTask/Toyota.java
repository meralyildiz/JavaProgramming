package day38_Inheritance_Overriding.carTask;

public class Toyota extends Car {

    public Toyota(String model, int year, double price, String colour, int miles) {
        super("Toyota", model, year, price, colour, miles);
    }
    public void reliable(){
        System.out.println(brand+" "+model+" is reliable");
    }


    public void start(){
        System.out.println("Twist the key to ignition to start "+brand+" "+model);
    }
}
