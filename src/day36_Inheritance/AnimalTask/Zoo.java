package day36_Inheritance.AnimalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'F', 2, "Small", "grey");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Lilly", "British", 'M', 3, "Small", "brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        cat.meow();
        cat.scratch();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 4, "Large", "red");
        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();
        tiger.hunt();
        tiger.roar();
        System.out.println(tiger);

    }
}
