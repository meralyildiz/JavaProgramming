package day39_Recap.shapeTask;

public class ShapeObject {
    public static void main(String[] args) {

        Square square= new Square(10);
        System.out.println(square);

        square.setSide(15);
        System.out.println(square);

        System.out.println("----------------------------------");
        Circle circle= new Circle(5.50);
        System.out.println(circle);

        circle.setRadius(4.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());

        System.out.println("----------------------------------");
        Rectangle rectangle= new Rectangle(12, 5);
        System.out.println(rectangle);

        rectangle.setLength(10);
        System.out.println(rectangle.getLength());

        System.out.println(rectangle);
        System.out.println(rectangle.getName());



    }
}
