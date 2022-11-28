package day37_Inheritance_SuperKeyword.animal;

public class AnimalObject {
    public static void main(String[] args) {

      Dog dog1 = new Dog("Max", "Husky", 'F', 5, "Small", "White");
      System.out.println(dog1);
      dog1.bark();
      dog1.drink();
      dog1.eat();
      dog1.move();
      dog1.sleep();

      Cat cat1 = new Cat("Lilly", "English",'M', 2, "Small", "Grey");
      System.out.println(cat1);
      cat1.scratch();
      cat1.drink();
      cat1.eat();
      cat1.move();
      cat1.sleep();



      Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Yellow");
      System.out.println(parrot1);
      parrot1.sing();
    }
}
