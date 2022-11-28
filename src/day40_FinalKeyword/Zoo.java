package day40_FinalKeyword;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', "White", "Large", 4);
        System.out.println(dog);
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());

        dog.drink();

        Dog dog2= new Dog("Lilly", "British", 'F', "Gray", "Small", 2);
        System.out.println(dog2);




    }
}
