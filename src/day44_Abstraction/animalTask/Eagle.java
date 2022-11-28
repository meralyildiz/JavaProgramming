package day44_Abstraction.animalTask;

public class Eagle extends Animal implements WildAnimal, Flyable {

    public Eagle(String name, String breed, char gender, int age, String size, String colour) {
        super(name, breed, gender, age, size, colour);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating snake");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" can fly 50km/h");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" hunts snake");
    }
}
