package day33_CustomClass_Statics;

public class Iphone {

    public static String brand = "Apple";

    public String model;

    public double price;

    public static String OS = "iOS";

    public String colour;

    public String size;

    public static String madeIn = "China";

    public static boolean isTouch = true;

    public static boolean hasBattery = true;

    public static boolean hasFaceTime = true;

    public void method1() {
        System.out.println(model+ " : "+ price);
        System.out.println(OS);
    }
}
